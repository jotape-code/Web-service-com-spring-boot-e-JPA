package com.joao.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.joao.project.entities.pk.OrderItemPk;
import com.joao.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
    
}
