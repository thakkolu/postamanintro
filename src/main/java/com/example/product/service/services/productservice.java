package com.example.product.service.services;

import com.example.product.service.exception.productnotfoundexception;
import com.example.product.service.models.products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

@Qualifier("dbimpl")
public interface productservice {
    public products getproductbyid(long id) throws productnotfoundexception;
    public products createproduct(String name,String description,String category);

    public List<products> getproduct();
    public  products updatedproduct(long id,String name,String description,String category);
    public void delete(long id) throws productnotfoundexception;
    public products selectproduct(String name) throws productnotfoundexception;
}
