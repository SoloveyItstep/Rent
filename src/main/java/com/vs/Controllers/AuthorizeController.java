package com.vs.Controllers;

import com.vs.Services.Interfaces.UsersService;
import com.vs.entity.Users;
import com.vs.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthorizeController {
//    @Autowired
//    UsersService usersService;
//    @Autowired
//    UsersRepository usersRepository;
//
//    @RequestMapping(value = "/authorize")
//    public String LoginPage(){
//        return "Authorize";
//    }
//
//    @RequestMapping(value = "/authorizedata",method = RequestMethod.POST)
//    public String Authorize(@ModelAttribute("login") String login, @ModelAttribute("password") String password){
//
//        Users user = usersRepository.findUsersByLoginAndPassword(login, password);
//        if(user != null)
//        {
//            return "Index";
//        }
//
//        return "AuthorizeError";
//    }
}
