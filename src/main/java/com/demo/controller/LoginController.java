package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.model.User;
import com.demo.repository.UserRepository;

@Controller
public class LoginController {

    @Autowired
    private UserRepository repo;

    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String getRegisterPage() {
        return "register";
    }

    @PostMapping("/register-user")
    public String addUser(User user) {

        System.out.println("Received Data : " + user);

        repo.save(user);

        return "login";
    }
    
    @PostMapping("/verify-login")
    public String verifyLogin(String username,
                              String password) {

        User user =
                repo.findByUsernameAndPassword(username,
                                               password);

        if(user != null) {

            System.out.println("Login Success");

            return "home";
        }

        System.out.println("Invalid Credentials");

        return "login";
    }
}