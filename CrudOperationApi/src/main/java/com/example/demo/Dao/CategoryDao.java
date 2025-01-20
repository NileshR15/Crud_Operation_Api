package com.example.demo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CategoryModel;
import com.example.demo.Repos.CategoryRepo;
import com.example.demo.Service.CategoryService;

@Service
public class CategoryDao implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepository;

	@Override
	public Page<CategoryModel> 
	getAllCategories(int page) 
	{	
		return categoryRepository.findAll(PageRequest.of(page, 5));
	}

	@Override
	public CategoryModel createCategory
	(CategoryModel category) 
	{
		return categoryRepository.save(category);
	}

	@Override
	public CategoryModel getCategoryById(Long id) 
	{
		return categoryRepository.findById(id).orElse(null);
	}

	@Override
	public CategoryModel updateCategory(Long id, CategoryModel category) 
	{
		if (categoryRepository.existsById(id)) 
		{
			category.setId(id);
			return categoryRepository.save(category);
	    }
		return null;
	}

	@Override
	public void deleteCategory(Long id) 
	{
		categoryRepository.deleteById(id);
	}

	
}
