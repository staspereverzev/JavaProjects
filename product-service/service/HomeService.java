package com.example.productservice.Stas.service;

import com.example.productservice.Stas.model.HomeProductRequest;
import com.example.productservice.Stas.model.HomeProductResponse;

public interface HomeService {

    long addProduct(HomeProductRequest homeProductRequest);

    HomeProductResponse getProduct(long id);
}
