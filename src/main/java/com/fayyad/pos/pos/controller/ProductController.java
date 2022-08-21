package com.fayyad.pos.pos.controller;


import com.fayyad.pos.pos.dao.ProductDao;
import com.fayyad.pos.pos.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/products")
@RestController
public class ProductController {
    @Autowired
    private ProductDao productDao;

    @PostMapping(path = "/add-product")
    public ProductEntity addproduct(@RequestBody ProductEntity product) {
        return this.productDao.addproduct(product);
    }
}
