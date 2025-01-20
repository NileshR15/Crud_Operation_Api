package com.example.demo.Service;

import org.springframework.data.domain.Page;

import com.example.demo.Model.ProductModel;



public interface ProductService {

	Page<ProductModel> getAllProducts(int page);

	ProductModel createProduct(ProductModel product);

	ProductModel getProductById(Long id);

	ProductModel updateProduct(Long id, ProductModel product);

	void deleteProduct(Long id);
}
