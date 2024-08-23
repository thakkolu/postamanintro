package com.example.product.service.services;

import com.example.product.service.exception.productnotfoundexception;
import com.example.product.service.models.products;
import org.springframework.beans.factory.annotation.Autowired;


public interface productservice {
    public products getproductbyid(long id) throws productnotfoundexception;

}
