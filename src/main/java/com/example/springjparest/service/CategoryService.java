package com.example.springjparest.service;

import java.util.List;

import com.example.springjparest.model.Category;

public interface CategoryService {

	public boolean createNewCategory(Category objCategory);
	public Category getCategoryById(int catId);
	public List<Category> getAllCategories();
}
