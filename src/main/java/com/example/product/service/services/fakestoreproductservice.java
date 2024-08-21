package com.example.product.service.services;

import com.example.product.service.dtos.fakestoreproductdto;
import com.example.product.service.models.products;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class fakestoreproductservice implements productservice {


    @Override
    public products getproductbyid(long id) {
        String url="https://fakestoreapi.com/products/" + id;
        RestTemplate restTemplate = new RestTemplate();
        fakestoreproductdto dto=restTemplate.getForObject(url, fakestoreproductdto.class);

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
