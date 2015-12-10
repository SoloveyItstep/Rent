package com.vs.Services.Interfaces;

import com.vs.entity.Categories;

import java.util.Collection;

public interface CategoriesService {
    void addCategory(Categories categories);
    void addSubcategory(Categories categories);
    void updateCategory(Categories categories);
    void updateSubcategory(Categories categories);
    void removeCategory(Long id);
    void removeSubcategory(Long id);
    Collection<Categories> findCategories();
    Collection<Categories> findSubcategories(Long categoryId);
    Categories findCategory(Long id);
    Categories findSubcategory(Long id);
}
