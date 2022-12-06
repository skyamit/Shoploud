package com.example.Shoploud.service;

import org.springframework.http.ResponseEntity;

import com.example.Shoploud.models.Tadmin;

public interface TadminService {
    
    public ResponseEntity<?> createAdmin(Tadmin admin);

    public ResponseEntity<?> loginAdmin(String email, String password);

}
