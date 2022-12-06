package com.example.Shoploud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shoploud.models.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.Shoploud.service.AdminServiceImpl;

@RestController
public class AdminController {
    
    @Autowired
    AdminServiceImpl adminServiceImpl;

// create admin
    @PostMapping("/createAdmin")
    public ResponseEntity<?> createAdmin(@RequestBody Admin admin) {
        return adminServiceImpl.createAdmin(admin);
    }

// login admin
    @GetMapping("/loginAdmin/{email}")
    public ResponseEntity<?> loginAdmin(@PathVariable String email, @RequestBody String password) {
        return adminServiceImpl.loginAdmin(email,password);
    }

// update admin

// verify admin


}
