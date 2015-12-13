package com.vs.Controllers;

import com.vs.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
    @Autowired
    CategoriesRepository categoriesRepository;
    @Autowired
    UsersRepository usersRepository;
    @Autowired
    ProductsRepository productsRepository;
    @Autowired
    ProductInfoRepository productInfoRepository;
    @Autowired
    ProductCountRepository productCountRepository;

    @RequestMapping(value = "/admin")
    public String login() {
        Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
        if (auth != null && auth.isAuthenticated()) {
            return "AdminPage";
        } else {
            return "redirect:/login";
        }
    }

    @RequestMapping("/addcategoriesHtml")
    public String addCategories(){
        Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
        if(auth == null) {
            return "redirect:/login";
        }
        return "AdminEdits/addcategories";
    }

    @RequestMapping("/addcategoryHtml")
    public String addCategory(){
        Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
        if(auth == null) {
            return "redirect:/login";
        }
        return "AdminEdits/addcategory";
    }

    @RequestMapping("/addsubcategoryHtml")
    public String addSubcategory(){
        Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
        if(auth == null) {
            return "redirect:/login";
        }
        return "AdminEdits/addsubcategory";
    }

    @RequestMapping("/editsubcategoryHtml")
    public String editSubcategory(){
        Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
        if(auth == null) {
            return "redirect:/login";
        }
        return "AdminEdits/editsubcategory";
    }

    @RequestMapping(value = "/savecategoryHtml",method = RequestMethod.POST)
    public String saveCategory(){

        return "AdminEdits/success";
    }

    @RequestMapping("/editcategoriesHtml")
    public String editCategories(){
        Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
        if(auth == null) {
            return "redirect:/login";
        }
        return "AdminEdits/editcategories";
    }

    @RequestMapping("/editcategoryHtml")
    public String editCategory(){
        Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
        if(auth == null) {
            return "redirect:/login";
        }
        return "AdminEdits/editcategory";
    }

    @RequestMapping("/addproductHtml")
    public String addProduct(){
        Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
        if(auth == null) {
            return "redirect:/login";
        }
        return "AdminEdits/addcategory";
    }

    @RequestMapping(value = "/saveproductHtml",method = RequestMethod.POST)
    public String saveProduct(){

        return "AdminEdits/success";
    }

}
