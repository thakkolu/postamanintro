package com.example.product.service.repositories;

import com.example.product.service.models.products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface productrepository extends JpaRepository<products,Long> {
       products findByNameAndCategory(String name,String category);
       Optional<products> findById(Long id);
       List<products> findAll();
       void deleteById(Long id);
       @Query("select p from products p where p.name= :name")
       Optional<products> selectByname(@Param("name") String name);

}

