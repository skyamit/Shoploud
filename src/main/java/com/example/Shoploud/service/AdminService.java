package com.example.Shoploud.service;

import org.springframework.http.ResponseEntity;

import com.example.Shoploud.models.Admin;

public interface AdminService {
    
    public ResponseEntity<?> createAdmin(Admin admin);

    public ResponseEntity<?> loginAdmin(String email, String password);

}
