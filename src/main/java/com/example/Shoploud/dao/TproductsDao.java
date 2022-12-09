package com.example.Shoploud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.Shoploud.models.Tproducts;

public interface TproductsDao extends JpaRepository<Tproducts,Long>{
    
    // get Categories 
    @Query(name = "select distinct fcategory from tproducts ",nativeQuery = true)
    public List<String> getFcategory();

    @Query(name="select * from tproducts where fadmin_id = :fadminId", nativeQuery = true)
    public List<Tproducts> getAdminProducts(Long fadminId);

    @Modifying
    @Query(name="update products set fname = :fname, fdescription = :fdescription, fcategory = :fcategory, favailableCount = :favailableCount, fselling_price :fsellingPrice, foriginal_price = :foriginalPrice, fupdated_at = :fupdatedAt, fpercentage_off := fpercentageOff where fid = :fid", nativeQuery = true)
    public void updateProduct(String fname, String fcategory, String fdescription, Long favailableCount,
    Integer fpercentageOff, Integer foriginalPrice, Integer fsellingPrice,
    String fupdatedAt);
}
