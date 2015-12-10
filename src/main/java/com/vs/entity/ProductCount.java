package com.vs.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "product_count")
public class ProductCount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long count;
    private long in_rent;

    @OneToOne(optional = true)
    @JoinColumn(name = "product_id",nullable = false)
    private Products product;

    public ProductCount() {
    }

    public ProductCount(long count, long in_rent, Products product) {
        this.count = count;
        this.in_rent = in_rent;
        this.product = product;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getIn_rent() {
        return in_rent;
    }

    public void setIn_rent(long in_rent) {
        this.in_rent = in_rent;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }
}
