package com.savi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savi.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
