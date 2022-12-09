package com.example.Shoploud.service;


import org.springframework.http.ResponseEntity;

import com.example.Shoploud.models.Tproducts;

public interface TproductsService {
    public ResponseEntity<?> getCategory();
    public ResponseEntity<?> getAdminProducts(Long fadminId);
    public ResponseEntity<?> addProduct(Tproducts product);
    public ResponseEntity<?> updateProduct(Tproducts product);
    public ResponseEntity<?> getSingleProduct(Long fid);
}
