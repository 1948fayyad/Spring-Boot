package com.fayyad.pos.pos.repository;

import com.fayyad.pos.pos.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {
}
