package com.joao.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joao.project.entities.Product;
import com.joao.project.repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        List<Product> list = productRepository.findAll();
        return list;
    }
    public Product findById(Long id){
        Optional<Product> u = productRepository.findById(id);
        return u.get();
    }
}
