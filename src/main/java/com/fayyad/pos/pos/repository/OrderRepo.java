package com.fayyad.pos.pos.repository;

import com.fayyad.pos.pos.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderEntity, Integer> {
}
