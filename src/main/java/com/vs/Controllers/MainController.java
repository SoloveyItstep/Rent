package com.vs.Controllers;

import com.vs.entity.Products;
import com.vs.repository.CategoriesRepository;
import com.vs.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    private CategoriesRepository categoriesRepository;

    @Autowired
    private ProductsRepository productsRepository;

    @RequestMapping("/")
    public Collection<Products> Index(){
        return productsRepository.findAll();
    }
}
