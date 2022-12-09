package com.example.Shoploud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Shoploud.models.Tadmin;
import com.example.Shoploud.dao.TadminDao;

@Service
public class TadminServiceImpl implements TadminService{

    @Autowired
    private TadminDao adminDao;

    @Override
    public ResponseEntity<?> createAdmin(Tadmin tadmin) {
        // check if account exisits or not
        String email = tadmin.getFemail();

        Tadmin tempAdmin = adminDao.getAdminByEmail(email);
        if(tempAdmin != null){
            return new ResponseEntity<>("Account already exists", HttpStatus.CONFLICT);
        }
        
        adminDao.save(tadmin);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Tadmin> loginAdmin(String temail, String tpassword) {
        Tadmin tempAdmin = adminDao.getAdmin(temail, tpassword);
        if(tempAdmin == null){
            return new ResponseEntity<>(new Tadmin(), HttpStatus.NOT_FOUND);
        }
        System.out.println("respone was delevered");
        return new ResponseEntity<>(tempAdmin,HttpStatus.OK);
    }

        
}
