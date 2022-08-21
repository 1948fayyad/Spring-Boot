package com.fayyad.pos.pos.dao;

import com.fasterxml.jackson.core.PrettyPrinter;
import com.fayyad.pos.pos.entity.ProductEntity;
import com.fayyad.pos.pos.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDao {
    @Autowired
    private ProductRepo productRepo;


    public ProductEntity addproduct(ProductEntity product){
        return this.productRepo.save(product);
    }


     }
