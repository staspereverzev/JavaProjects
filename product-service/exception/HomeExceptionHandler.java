package com.example.productservice.Stas.exception;

import com.example.productservice.Stas.model.HomeError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HomeExceptionHandler {

    @ExceptionHandler(value = HomeProductException.class)
    public ResponseEntity<HomeError> noProductException(HomeProductException e){
        HomeError homeError = new HomeError(e.getMessage(), "NOT_FOUND");
        return new ResponseEntity<>(homeError, HttpStatus.NOT_FOUND);
    }

}
