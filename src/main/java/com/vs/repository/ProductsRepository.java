package com.vs.repository;

import com.vs.entity.Products;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface ProductsRepository extends CrudRepository<Products,Long> {
    @Override
    Products save(Products products);

    @Override
    Products findOne(Long id);

    @Override
    boolean exists(Long id);

    @Override
    Collection<Products> findAll();

    Collection<Products> findProductsBySubcategoryId(Long subcategoryId);

    @Override
    long count();

    @Override
    void delete(Long id);
}
