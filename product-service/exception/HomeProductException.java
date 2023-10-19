package com.example.productservice.Stas.exception;

public class HomeProductException extends RuntimeException{

    private String errorCode;

    public HomeProductException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
