package com.example.Shoploud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shoploud.models.Tadmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.Shoploud.service.TadminServiceImpl;

@RestController
public class AdminController {
    
    @Autowired
    TadminServiceImpl adminServiceImpl;

// create admin
    @PostMapping("/createAdmin")
    public ResponseEntity<?> createAdmin(@RequestBody Tadmin tadmin) {
        System.out.println(tadmin);
        return adminServiceImpl.createAdmin(tadmin);
    }

// login admin
    @GetMapping("/loginAdmin/{femail}/{fpassword}")
    public ResponseEntity<?> loginAdmin(@PathVariable String femail, @PathVariable String fpassword) {
        System.out.println(femail+" "+fpassword);
        return adminServiceImpl.loginAdmin(femail,fpassword);
    }

}
