package com.joao.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joao.project.entities.Order;
import com.joao.project.repositories.OrderRepository;

@Service
public class OrderService{

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        List<Order> list = orderRepository.findAll();
        return list;
    }

    public Order findById(Long id){
        Optional<Order> u = orderRepository.findById(id);
        return u.get();
    }

}