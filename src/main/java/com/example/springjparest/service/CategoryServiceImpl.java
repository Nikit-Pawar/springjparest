package com.example.springjparest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjparest.model.Category;
import com.example.springjparest.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository repo;
	
	@Override
	public boolean createNewCategory(Category objCategory) {
		// TODO Auto-generated method stub
		repo.save(objCategory);
		return true;
	}

	@Override
	public Category getCategoryById(int catId) {
		// TODO Auto-generated method stub
		Category objCategory=repo.findById(catId).get();
		return objCategory;
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		System.out.println(repo);
		return repo.findAll();
	}

}
