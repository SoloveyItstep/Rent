package com.vs.Controllers;

import com.vs.repository.CategoriesRepository;
import com.vs.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    private CategoriesRepository categoriesRepository;

    @Autowired
    private ProductsRepository productsRepository;

    @RequestMapping("/")
    public String Index(Model model){
        //model.addAttribute("categories",categoriesRepository.findAll());
        return "Index";
    }

    @RequestMapping("/productsHtml")
    public String Products(Model model){
        return "Products";
    }

    @RequestMapping("/productHtml")
    public String Product(){
        return "Product";
    }

}
