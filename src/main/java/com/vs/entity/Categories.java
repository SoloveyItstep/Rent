package com.vs.entity;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CategoriesRepository")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @ManyToOne(optional = true)
    @JoinColumn(name = "subcategory_id")
    private Categories category;

    @OneToMany(mappedBy = "category")
    private List<Categories> subcategories;

    @OneToMany(mappedBy = "subcategory")
    private List<Products> products;

    public Categories() {
    }

    public Categories(String name, Categories category, List<Categories> subcategories, List<Products> products) {
        this.name = name;
        this.category = category;
        this.subcategories = subcategories;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public List<Categories> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<Categories> subcategories) {
        this.subcategories = subcategories;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}
