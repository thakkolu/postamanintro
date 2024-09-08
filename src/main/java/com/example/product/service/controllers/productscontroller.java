package com.example.product.service.controllers;

import com.example.product.service.dtos.createproductDto;
import com.example.product.service.dtos.updateproductDto;
import com.example.product.service.exception.productnotfoundexception;
import com.example.product.service.models.products;
import com.example.product.service.services.productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class productscontroller {
    @Autowired
    @Qualifier("dbimpl")
    private productservice productService;
    //we want to et the product details by product id
    @GetMapping("/{id}")
    public ResponseEntity<products> getproductbyid(@PathVariable("id") long id) throws productnotfoundexception {
        //if(id<1 || id>20) {
       //     return new ResponseEntity<>(HttpStatusCode.valueOf(400));
       // }
        products product = productService.getproductbyid(id);
        return new ResponseEntity<>(product, HttpStatusCode.valueOf(200));

    }
    @PostMapping()
    public products createproduct(@RequestBody createproductDto requestdto){
        return productService.createproduct(requestdto.getName(), requestdto.getDescription(), requestdto.getCategory());
    }
//    @GetMapping("/{id}")
//    public products getproduct(@PathVariable("id") Long id)throws productnotfoundexception {
//        products product = productService.getproductbyid(id);
//        return product;
//
//    }
    @GetMapping()
        public List<products> getprod(){
        List<products> pp=productService.getproduct();
        return pp;
        }


    @PutMapping("/{id}")
    public ResponseEntity<products> updateProduct(
            @PathVariable("id") Long id,
            @RequestBody updateproductDto requestDto) {
        products updatedProduct = productService.updatedproduct(
                id,
                requestDto.getName(),
                requestDto.getDescription(),
                requestDto.getCategory()
        );
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        try{
            productService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // 204 No Content
        } catch (productnotfoundexception ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404 Not Found
        }
    }
    @GetMapping("/name/{name}")
    public products getthepeoduct(@PathVariable("name") String name) throws productnotfoundexception {
        products pp = productService.selectproduct(name);
    return pp;
    }
    }
