package com.example.productservice.Stas.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HomeError {

    private String message;
    private String code;

    public HomeError(String message, String code) {
        this.message = message;
        this.code = code;
    }
}
