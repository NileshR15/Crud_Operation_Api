package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.ProductModel;

public interface ProductRepo extends JpaRepository<ProductModel, Long>  {

}
