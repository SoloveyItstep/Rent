package com.vs.Controllers;

import com.vs.entity.Categories;
import com.vs.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

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

    @RequestMapping("/subcategoriesHtml")
    public String sabcategoriesPage(){
        return "AdminEdits/subcategories";
    }

    @RequestMapping("/editsubcategoryHtml")
    public String editSubcategory(){
        Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
        if(auth == null) {
            return "redirect:/login";
        }
        return "AdminEdits/editsubcategory";
    }

    @RequestMapping("/deletecategoryHtml")
    public String deleteCategory(){
        Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
        if(auth == null) {
            return "redirect:/login";
        }

        return "AdminEdits/deletecategory";
    }

    @RequestMapping(value = "/removecategoryHtml",method = RequestMethod.POST)
    public String RemoveCategory(@Valid Categories category){
        categoriesRepository.delete(category.getId());
        return "redirect:/admin";
    }

    @RequestMapping("/deletesubcategoryHtml")
    public String deleteSubcategory(){
        Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
        if(auth == null) {
            return "redirect:/login";
        }
        return "AdminEdits/deletesubcategory";
    }

    @RequestMapping(value = "/createcategoryHtml",method = RequestMethod.POST)
    public String createCategory(@RequestParam("name") String name){
        Categories category = new Categories();
        category.setName(name);
        categoriesRepository.save(category);

        return "AdminEdits/success";
    }

    @RequestMapping(value = "/savecategoryHtml",method = RequestMethod.POST)
    public String saveCategory(@Valid Categories category){
        Categories categories = categoriesRepository.findOne(category.getId());
        categories.setName(category.getName());
        categoriesRepository.save(categories);

        return "AdminEdits/success";
    }

    @RequestMapping(value = "/savesubcategoryHtml",method = RequestMethod.POST)
    public String saveSubcategory(@Valid Categories category,@RequestParam("parent_id") Long id){
        Categories categories = new Categories();
        categories.setName(category.getName());
        Categories parent = categoriesRepository.findOne(id);
        categories.setCategory(parent);
        categoriesRepository.save(categories);

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
        return "AdminEdits/addproduct";
    }

    @RequestMapping("/addproductsHtml")
    public String addProducts(){
        Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
        if(auth == null) {
            return "redirect:/login";
        }
        return "AdminEdits/addproducts";
    }

    @RequestMapping("/editproductHtml")
    public String editProduct(){
        Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
        if(auth == null) {
            return "redirect:/login";
        }
        return "AdminEdits/editproduct";
    }

    @RequestMapping("/deleteproductHtml")
    public String deleteProduct(){
        Authentication auth =  SecurityContextHolder.getContext().getAuthentication();
        if(auth == null) {
            return "redirect:/login";
        }
        return "AdminEdits/deleteproduct";
    }

    @RequestMapping(value = "/saveproductHtml",method = RequestMethod.POST)
    public String saveProduct(){

        return "AdminEdits/success";
    }

}
