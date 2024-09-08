package com.example.product.service.services;

import com.example.product.service.exception.productnotfoundexception;
import com.example.product.service.models.products;
import com.example.product.service.repositories.productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("dbimpl")
public class productserviceimpl implements productservice {
    @Autowired
    productrepository repository;

    @Override
    public products getproductbyid(long id) throws productnotfoundexception {
      //      return repository.findById(id)
        //            .orElseThrow(() -> new productnotfoundexception("Product not found with id: " + id));
        Optional<products> pp= repository.findById(id);
            if(pp.isPresent()){
                return pp.get();
            }
            else{
                throw new productnotfoundexception("product not found");
            }

    }

    @Override
    public products createproduct(String name, String description, String category) {
        products pp = repository.findByNameAndCategory(name, category);
        if (pp != null) {
            return pp;
        }
            products p = new products();
            p.setName(name);
            p.setDescription(description);
            p.setCategory(category);
            p = repository.save(p);
            System.out.println(p.getId());
            return p;
        }

    @Override
    public List<products> getproduct() {
        List<products> pp= repository.findAll();
        return pp;
    }

    @Override
    public products updatedproduct(long id, String name, String description, String category) {
        Optional<products> pp = repository.findById(id);
        if (pp.isPresent()) {
            products pq=pp.get();
            pq.setName(name);
            pq.setDescription(description);
            pq.setCategory(category);
         return repository.save(pq);
        }
        else{
            return null;
        }
    }

    @Override
    public void delete(long id) throws productnotfoundexception {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new productnotfoundexception("Product not found with id: " + id);
        }
    }

    @Override
    public products selectproduct(String name) throws productnotfoundexception {
        Optional<products> pp=repository.selectByname(name);
        if(pp.isPresent()){
            return pp.get();
        }else{
            throw new productnotfoundexception("product not found with id: " + name);
        }
    }
}