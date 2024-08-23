package com.example.product.service.advice;

import com.example.product.service.exception.productnotfoundexception;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class controlleradvice {
    @ExceptionHandler(productnotfoundexception.class)
    public ResponseEntity<String> notproductnotfoundexception(productnotfoundexception e){
        return new ResponseEntity<>(e.getMessage(), HttpStatusCode.valueOf(400));
    }
}
