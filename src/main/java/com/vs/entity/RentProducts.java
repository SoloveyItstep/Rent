package com.vs.entity;

import javax.persistence.Entity;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "rent_products")
public class RentProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long count;
    private Date date;
    private long time_order;
    private long order_num;

    @ManyToOne(optional = true)
    @JoinColumn(name = "product_id")
    private Products product;

    @ManyToOne(optional = true)
    @JoinColumn(name = "user_id")
    private Users user;

    public RentProducts() {
    }

    public RentProducts(long count, Date date, long time_order,
                        long order_num, Products product, Users user) {
        this.count = count;
        this.date = date;
        this.time_order = time_order;
        this.order_num = order_num;
        this.product = product;
        this.user = user;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getTime_order() {
        return time_order;
    }

    public void setTime_order(long time_order) {
        this.time_order = time_order;
    }

    public long getOrder_num() {
        return order_num;
    }

    public void setOrder_num(long order_num) {
        this.order_num = order_num;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
