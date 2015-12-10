package com.vs.Services.Interfaces;


import com.vs.entity.Products;

import java.util.Collection;

public interface ProductsService {
    void addProduct(Products products);
    void updateProduct(Products products);
    void removeProduct(Long id);
    Collection<Products> findProducts();
    Collection<Products> findProductsBySubcategoryId(Long subcategoryId);
    Products findProductById(Long id);
}
