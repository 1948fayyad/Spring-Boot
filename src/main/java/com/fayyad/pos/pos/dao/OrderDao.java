package com.fayyad.pos.pos.dao;


import com.fayyad.pos.pos.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDao {
    @Autowired
    private OrderRepo orderRepo;
}
