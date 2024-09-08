package com.example.product.service.services;

import com.example.product.service.dtos.fakestoreproductdto;
import com.example.product.service.exception.productnotfoundexception;
import com.example.product.service.models.products;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("fakestore")
public class fakestoreproductservice implements productservice {
    @Override
    public products selectproduct(String name) throws productnotfoundexception {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public products updatedproduct(long id, String name, String description, String category) {
        return null;
    }

    @Override
    public List<products> getproduct() {
        return List.of();
    }

    @Override
    public products createproduct(String name, String description, String category) {
        return null;
    }

    @Override
    public products getproductbyid(long id) throws productnotfoundexception {
        String url="https://fakestoreapi.com/products/" + id;
        RestTemplate restTemplate = new RestTemplate();
        fakestoreproductdto dto=restTemplate.getForObject(url, fakestoreproductdto.class);
         if(dto==null){
             throw new productnotfoundexception("product id of " +id+"is not found.");
         }
        return convertfakestoreproducttoproduct(dto);
    }
    public products convertfakestoreproducttoproduct(fakestoreproductdto dto){
        products product=new products();
        product.setCategory(dto.getCategory());
        product.setDescription(dto.getDescription());
        product.setName(dto.getTitle());
     return product;
    }

}
