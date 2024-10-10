package com.sakib.quickcart.repo;

import com.sakib.quickcart.controller.ProductController;
import com.sakib.quickcart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
