package com.example.product.service.controllers;

import com.example.product.service.exception.productnotfoundexception;
import com.example.product.service.models.products;
import com.example.product.service.services.productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productscontroller {
    @Autowired
    private productservice productService;
    //we want to et the product details by product id
    @GetMapping("/product/{id}")
    public ResponseEntity<products> getproductbyid(@PathVariable("id") long id) throws productnotfoundexception {
        //if(id<1 || id>20) {
       //     return new ResponseEntity<>(HttpStatusCode.valueOf(400));
       // }
        products product = productService.getproductbyid(id);
        return new ResponseEntity<>(product, HttpStatusCode.valueOf(200));

    }

}
