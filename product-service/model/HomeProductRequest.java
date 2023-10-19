package com.example.productservice.Stas.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HomeProductRequest {

    private String name;
    private long price;
    private long quantity;
}
