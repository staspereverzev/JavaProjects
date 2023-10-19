package com.example.productservice.Stas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HomeProductResponse {

    private long id;
    private String name;
    private long price;
    private long quantity;
}
