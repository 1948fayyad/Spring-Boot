package com.fayyad.pos.pos.controller;

import com.fayyad.pos.pos.dao.SaleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/sales")
@RestController
public class SaleController {
    @Autowired
    private SaleDao saleDao;
}
