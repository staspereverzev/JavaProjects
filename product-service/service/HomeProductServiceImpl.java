package com.example.productservice.Stas.service;

import com.example.productservice.Stas.entity.HomeProductEntity;
import com.example.productservice.Stas.exception.HomeProductException;
import com.example.productservice.Stas.model.HomeProductRequest;
import com.example.productservice.Stas.model.HomeProductResponse;
import com.example.productservice.Stas.repository.HomeProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.springframework.beans.BeanUtils.copyProperties;

@Service
@Log4j2
public class HomeProductServiceImpl implements HomeService{

    private final HomeProductRepository homeProductRepository;

    @Autowired
    public HomeProductServiceImpl(HomeProductRepository homeProductRepository) {
        this.homeProductRepository = homeProductRepository;
    }

    @Override
    public long addProduct(HomeProductRequest homeProductRequest) {


        log.info("Adding product...");

        HomeProductEntity homeProductEntity = HomeProductEntity.builder()
                .name(homeProductRequest.getName())
                .price(homeProductRequest.getPrice())
                .quantity(homeProductRequest.getQuantity())
                .build();

        homeProductRepository.save(homeProductEntity);

        log.info("Product created");

        return homeProductEntity.getId();
    }

    @Override
    public HomeProductResponse getProduct(long productId) {
        HomeProductEntity homeProductEntity = homeProductRepository.findById(productId)
                .orElseThrow(
                        () -> new HomeProductException("No product", "NOT_FOUND"));

        HomeProductResponse homeProductResponse = new HomeProductResponse();

        copyProperties(homeProductEntity, homeProductResponse);

        return homeProductResponse;
    }
}
