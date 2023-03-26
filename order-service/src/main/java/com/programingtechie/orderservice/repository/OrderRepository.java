package com.programingtechie.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programingtechie.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
