package com.vs.repository;

import com.vs.entity.Categories;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface CategoriesRepository extends CrudRepository<Categories,Long> {
    @Override
    Categories save(Categories categories);

    Collection<Categories> findByCategoryIsNull();

    Collection<Categories> findSubcategoriesByCategoryId(Long categoryId);

    @Override
    Categories findOne(Long id);

    @Override
    boolean exists(Long id);

    @Override
    Collection<Categories> findAll();

    @Override
    long count();

    @Override
    void delete(Long id);
}
