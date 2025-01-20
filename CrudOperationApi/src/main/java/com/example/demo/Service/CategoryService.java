package com.example.demo.Service;

import org.springframework.data.domain.Page;

import com.example.demo.Model.CategoryModel;

public interface CategoryService {

	

    Page<CategoryModel> getAllCategories(int page);
    CategoryModel createCategory(CategoryModel category);
    CategoryModel getCategoryById(Long id);
    CategoryModel updateCategory(Long id, CategoryModel category);
    void deleteCategory(Long id);

}
