package com.savi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savi.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
