package com.example.Shoploud.models;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Products {
    
    @Id
    private Long id;
    
    @Column(name="admin_id")
    private Long AdminId;

    @Column(name="name")
    private String name;

    @Column(name="category")
    private String category;

    @Column(name="description")
    private String description;

    @Column(name = "available_count")
    private Long availableCount;

    @Column(name="percentage_off")
    private Integer percentageOff;

    @Column(name="original_price")
    private Integer originalPrice;

    @Column(name="selling_price")
    private Integer sellingPrice;

    @Column(name="status")
    private Integer status;

    @Column(name = "created_at")
    private Time createdAt;

    @Column(name="updated_at")
    private Time updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAdminId() {
        return AdminId;
    }

    public void setAdminId(Long adminId) {
        AdminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(Long availableCount) {
        this.availableCount = availableCount;
    }

    public Integer getPercentageOff() {
        return percentageOff;
    }

    public void setPercentageOff(Integer percentageOff) {
        this.percentageOff = percentageOff;
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Integer sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Time getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Time createdAt) {
        this.createdAt = createdAt;
    }

    public Time getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Time updatedAt) {
        this.updatedAt = updatedAt;
    }

    

}
