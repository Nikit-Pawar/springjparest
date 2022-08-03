package com.example.springjparest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springjparest.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
