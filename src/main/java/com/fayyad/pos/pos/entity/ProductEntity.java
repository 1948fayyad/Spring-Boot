package com.fayyad.pos.pos.entity;


import lombok.Data;

import javax.persistence.*;


@Table(name = "products")
@Data
@Entity
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private double productPrice;

    @Column(name = "barcode")
    private String barcode;



}
