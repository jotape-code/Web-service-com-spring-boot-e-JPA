package com.joao.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
