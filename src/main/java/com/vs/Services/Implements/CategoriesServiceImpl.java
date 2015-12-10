package com.vs.Services.Implements;

import com.vs.Services.Interfaces.CategoriesService;
import com.vs.entity.Categories;
import com.vs.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    CategoriesRepository repository;

    @Override
    public void addCategory(Categories categories) {

    }

    @Override
    public void addSubcategory(Categories categories) {

    }

    @Override
    public void updateCategory(Categories categories) {

    }

    @Override
    public void updateSubcategory(Categories categories) {

    }

    @Override
    public void removeCategory(Long id) {

    }

    @Override
    public void removeSubcategory(Long id) {

    }

    @Override
    public Collection<Categories> findCategories() {
        return null;
    }

    @Override
    public Collection<Categories> findSubcategories(Long categoryId) {
        return null;
    }

    @Override
    public Categories findCategory(Long id) {
        return null;
    }

    @Override
    public Categories findSubcategory(Long id) {
        return null;
    }
}
