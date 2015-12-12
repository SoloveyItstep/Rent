package com.vs.Controllers;

import com.vs.entity.Categories;
import com.vs.entity.Products;
import com.vs.repository.CategoriesRepository;
import com.vs.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class CategoriesController {
    @Autowired
    CategoriesRepository categoriesRepository;
    @Autowired
    ProductsRepository productsRepository;

    @RequestMapping("/categories")
    public Collection<Categories> categoriesCollection(){
        return categoriesRepository.findByCategoryIsNull();
    }

    @RequestMapping("/products")
    public Collection<Products> productsCollection(){
        return productsRepository.findAll();
    }

    @RequestMapping(value = "products/{id}")
    public Collection<Products> productsByCategoryId(@PathVariable Long id){
        return productsRepository.findProductsBySubcategoryId(id);
    }

    @RequestMapping(value = "product/{id}")
    public Products getProductById(@PathVariable Long id){
        return productsRepository.findOne(id);
    }
}
