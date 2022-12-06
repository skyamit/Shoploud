package com.example.Shoploud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Shoploud.models.Admin;
import com.example.Shoploud.dao.AdminDao;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminDao adminDao;

    @Override
    public ResponseEntity<?> createAdmin(Admin admin) {
        // check if account exisits or not
        String email = admin.getEmail();
        String password = admin.getPassword();

        Admin tempAdmin = adminDao.getAdmin(email, password);
        if(tempAdmin != null){
            return new ResponseEntity<>("Account already exists", HttpStatus.CONFLICT);
        }
        
        adminDao.save(admin);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> loginAdmin(String email, String password) {
        Admin tempAdmin = adminDao.getAdmin(email, password);
        if(tempAdmin == null){
            return new ResponseEntity<>("Account doesn't exists", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(tempAdmin,HttpStatus.OK);
    }

    
}
