package com.joao.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
