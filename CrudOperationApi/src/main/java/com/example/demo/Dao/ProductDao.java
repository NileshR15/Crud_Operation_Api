package com.example.demo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ProductModel;
import com.example.demo.Repos.ProductRepo;
import com.example.demo.Service.ProductService;

@Service
public class ProductDao implements ProductService {

	
	
	@Autowired
	private ProductRepo productRepository;

	@Override
	public Page<ProductModel> 
	getAllProducts(int page) 
	{
		return productRepository.findAll(PageRequest.of(page, 5));
	}

	@Override
	public ProductModel createProduct
	(ProductModel product) 
	{	
		return productRepository.save(product);
	}

	@Override
	public ProductModel getProductById(Long id) 
	{
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public ProductModel updateProduct
	(Long id, ProductModel product) 
	{
		if (productRepository.existsById(id)) {
			product.setId(id);
			return productRepository.save(product);
		}
		return null;
	}

	@Override
	public void deleteProduct(Long id)
	{
		productRepository.deleteById(id);
	}

	
}
