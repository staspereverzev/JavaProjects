package com.example.productservice.Stas.controller;

import com.example.productservice.Stas.model.HomeProductRequest;
import com.example.productservice.Stas.model.HomeProductResponse;
import com.example.productservice.Stas.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home/product")
public class HomeProductController {

    private final HomeService homeService;

    public HomeProductController(HomeService homeService) {
        this.homeService = homeService;
    }

    @PostMapping
    public ResponseEntity<Long> addProductInfo(@RequestBody HomeProductRequest homeProductRequest){
        long productId = homeService.addProduct(homeProductRequest);
        return new ResponseEntity<>(productId, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HomeProductResponse> getProductInfo(@PathVariable ("id") long productId){

        HomeProductResponse homeProductResponse
                = homeService.getProduct(productId);

        return new ResponseEntity<>(homeProductResponse, HttpStatus.OK);
    }
}
