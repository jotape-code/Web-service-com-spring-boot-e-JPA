package com.joao.project.services;

import java.util.List;
import java.util.Optional;

import com.joao.project.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joao.project.repositories.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        List<Category> list = categoryRepository.findAll();
        return list;
    }
    public Category findById(Long id){
        Optional<Category> u = categoryRepository.findById(id);
        return u.get();
    }

}
