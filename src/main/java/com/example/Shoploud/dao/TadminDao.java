package com.example.Shoploud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Shoploud.models.Tadmin;

public interface TadminDao extends JpaRepository<Tadmin, Long> {

    @Query(value="Select * from tadmin where femail=:femail and fpassword=:fpassword limit 1",nativeQuery=true)
    public Tadmin getAdmin(String femail, String fpassword);

}