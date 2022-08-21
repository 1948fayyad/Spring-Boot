package com.fayyad.pos.pos.controller;

import com.fayyad.pos.pos.dao.OrderDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/orders")
@RestController
public class OrderController {
    private OrderDao orderDao;
}
