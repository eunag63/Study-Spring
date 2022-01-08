package com.spartacodingclub.springdeep.repository;

import com.spartacodingclub.springdeep.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}