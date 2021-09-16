package com.shardul.springboot.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shardul.springboot.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
