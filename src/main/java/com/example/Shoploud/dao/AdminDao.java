package com.example.Shoploud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Shoploud.models.Admin;

public interface AdminDao extends JpaRepository<Admin, Long> {

    @Query(value="Select * from admin where email=:email and password=:password limit 1",nativeQuery=true)
    public Admin getAdmin(String email, String password);

}