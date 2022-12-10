package com.example.Shoploud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Shoploud.dao.TproductsDao;
import com.example.Shoploud.models.Tproducts;

@Service
public class TproductsServiceImpl implements TproductsService{

    @Autowired
    TproductsDao tproductsDao;

    @Override
    public ResponseEntity<List<String>> getCategory() {
        return new ResponseEntity<>(tproductsDao.getCategory(),HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<List<Tproducts>> getAdminProducts(Long fadminId) {
        return new ResponseEntity<>(tproductsDao.getProducts(fadminId),HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<?> addProduct(Tproducts product) {
        tproductsDao.save(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> updateProduct(Tproducts product) {
        tproductsDao.updateProduct(product.getFname(), product.getFcategory(), product.getFdescription(), product.getFavailableCount(),
        product.getFpercentageOff(), product.getForiginalPrice(), product.getFsellingPrice(), 
        product.getFupdatedAt());
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<?> getSingleProduct(Long fid) {
        return new ResponseEntity<>(tproductsDao.getReferenceById(fid), HttpStatus.OK);
    }
    
}
