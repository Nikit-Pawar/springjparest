package com.example.springjparest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjparest.model.Category;
import com.example.springjparest.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("allCategories")
	public List<Category> allCategories()
	{
		return categoryService.getAllCategories();
	}
	
	@GetMapping("getCategoryById")
	public Category getCatById(@RequestParam(name="catId") int catId)
	{
		return categoryService.getCategoryById(catId);
	}
	
	@PostMapping("newCategory")
	public boolean newCategory(@RequestBody Category objCategory)
	{
		return categoryService.createNewCategory(objCategory);
	}
}
