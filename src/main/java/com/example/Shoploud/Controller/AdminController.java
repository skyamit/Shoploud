package com.example.Shoploud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shoploud.models.Tadmin;
import com.example.Shoploud.models.Tproducts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.Shoploud.service.TadminServiceImpl;
import com.example.Shoploud.service.TproductsServiceImpl;

@RestController
public class AdminController {
    
    @Autowired
    TadminServiceImpl adminServiceImpl;
    @Autowired
    TproductsServiceImpl tproductsServiceImpl;

// create admin
    @PostMapping(path="/createAdmin", consumes = {"application/json"})
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

    @GetMapping("/admin/category")
    public ResponseEntity<?> getCategory(){
        return tproductsServiceImpl.getCategory();
    }

    @GetMapping("/products/{fadminId}")
    public ResponseEntity<?> getAdminProduct(@PathVariable Long fadminId){
        return tproductsServiceImpl.getAdminProducts(fadminId);
    }

    @PostMapping("/products/add")
    public ResponseEntity<?> addProducts(@RequestBody Tproducts products){
        return tproductsServiceImpl.addProduct(products);
    } 

    @PutMapping("/products/update")
    public ResponseEntity<?> updatedProducts(@RequestBody Tproducts products){
        return tproductsServiceImpl.updateProduct(products);
    }

    @GetMapping("/product/{fid}")
    public ResponseEntity<?> getSingleProduct(@PathVariable Long fid){
        return tproductsServiceImpl.getSingleProduct(fid);
    }

}
