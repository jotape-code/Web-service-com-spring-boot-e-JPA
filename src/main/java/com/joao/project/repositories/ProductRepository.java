package com.joao.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
