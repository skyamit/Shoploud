package com.example.Shoploud.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TPRODUCTS")
public class Tproducts {
    
    @Id
    @GeneratedValue
    private Long fid;
    
    @Column(name="fadmin_id")
    private Long fadminId;

    @Column(name="fname")
    private String fname;

    @Column(name="fcategory")
    private String fcategory;

    @Column(name="fdescription")
    private String fdescription;

    @Column(name = "favailable_count")
    private Long favailableCount;

    @Column(name="fpercentage_off")
    private Integer fpercentageOff;

    @Column(name="foriginal_price")
    private Integer foriginalPrice;

    @Column(name="fselling_price")
    private Integer fsellingPrice;

    @Column(name="fstatus")
    private Integer fstatus;

    @Column(name = "fcreated_at")
    private String fcreatedAt;

    @Column(name="fupdated_at")
    private String fupdatedAt;

    public Tproducts() {
    }
    public Tproducts(Long fid, Long fadminId, String fname, String fcategory, String fdescription, Long favailableCount,
            Integer fpercentageOff, Integer foriginalPrice, Integer fsellingPrice, Integer fstatus, String fcreatedAt,
            String fupdatedAt) {
        this.fid = fid;
        this.fadminId = fadminId;
        this.fname = fname;
        this.fcategory = fcategory;
        this.fdescription = fdescription;
        this.favailableCount = favailableCount;
        this.fpercentageOff = fpercentageOff;
        this.foriginalPrice = foriginalPrice;
        this.fsellingPrice = fsellingPrice;
        this.fstatus = fstatus;
        this.fcreatedAt = fcreatedAt;
        this.fupdatedAt = fupdatedAt;
    }

    
    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getFadminId() {
        return fadminId;
    }

    public void setFadminId(Long fadminId) {
        this.fadminId = fadminId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFcategory() {
        return fcategory;
    }

    public void setFcategory(String fcategory) {
        this.fcategory = fcategory;
    }

    public String getFdescription() {
        return fdescription;
    }

    public void setFdescription(String fdescription) {
        this.fdescription = fdescription;
    }

    public Long getFavailableCount() {
        return favailableCount;
    }

    public void setFavailableCount(Long favailableCount) {
        this.favailableCount = favailableCount;
    }

    public Integer getFpercentageOff() {
        return fpercentageOff;
    }

    public void setFpercentageOff(Integer fpercentageOff) {
        this.fpercentageOff = fpercentageOff;
    }

    public Integer getForiginalPrice() {
        return foriginalPrice;
    }

    public void setForiginalPrice(Integer foriginalPrice) {
        this.foriginalPrice = foriginalPrice;
    }

    public Integer getFsellingPrice() {
        return fsellingPrice;
    }

    public void setFsellingPrice(Integer fsellingPrice) {
        this.fsellingPrice = fsellingPrice;
    }

    public Integer getFstatus() {
        return fstatus;
    }

    public void setFstatus(Integer fstatus) {
        this.fstatus = fstatus;
    }

    public String getFcreatedAt() {
        return fcreatedAt;
    }

    public void setFcreatedAt(String fcreatedAt) {
        this.fcreatedAt = fcreatedAt;
    }

    public String getFupdatedAt() {
        return fupdatedAt;
    }

    public void setFupdatedAt(String fupdatedAt) {
        this.fupdatedAt = fupdatedAt;
    }

    @Override
    public String toString() {
        return "Tproducts [fid=" + fid + ", fadminId=" + fadminId + ", fname=" + fname + ", fcategory=" + fcategory
                + ", fdescription=" + fdescription + ", favailableCount=" + favailableCount + ", fpercentageOff="
                + fpercentageOff + ", foriginalPrice=" + foriginalPrice + ", fsellingPrice=" + fsellingPrice
                + ", fstatus=" + fstatus + ", fcreatedAt=" + fcreatedAt + ", fupdatedAt=" + fupdatedAt + "]";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fid == null) ? 0 : fid.hashCode());
        result = prime * result + ((fadminId == null) ? 0 : fadminId.hashCode());
        result = prime * result + ((fname == null) ? 0 : fname.hashCode());
        result = prime * result + ((fcategory == null) ? 0 : fcategory.hashCode());
        result = prime * result + ((fdescription == null) ? 0 : fdescription.hashCode());
        result = prime * result + ((favailableCount == null) ? 0 : favailableCount.hashCode());
        result = prime * result + ((fpercentageOff == null) ? 0 : fpercentageOff.hashCode());
        result = prime * result + ((foriginalPrice == null) ? 0 : foriginalPrice.hashCode());
        result = prime * result + ((fsellingPrice == null) ? 0 : fsellingPrice.hashCode());
        result = prime * result + ((fstatus == null) ? 0 : fstatus.hashCode());
        result = prime * result + ((fcreatedAt == null) ? 0 : fcreatedAt.hashCode());
        result = prime * result + ((fupdatedAt == null) ? 0 : fupdatedAt.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tproducts other = (Tproducts) obj;
        if (fid == null) {
            if (other.fid != null)
                return false;
        } else if (!fid.equals(other.fid))
            return false;
        if (fadminId == null) {
            if (other.fadminId != null)
                return false;
        } else if (!fadminId.equals(other.fadminId))
            return false;
        if (fname == null) {
            if (other.fname != null)
                return false;
        } else if (!fname.equals(other.fname))
            return false;
        if (fcategory == null) {
            if (other.fcategory != null)
                return false;
        } else if (!fcategory.equals(other.fcategory))
            return false;
        if (fdescription == null) {
            if (other.fdescription != null)
                return false;
        } else if (!fdescription.equals(other.fdescription))
            return false;
        if (favailableCount == null) {
            if (other.favailableCount != null)
                return false;
        } else if (!favailableCount.equals(other.favailableCount))
            return false;
        if (fpercentageOff == null) {
            if (other.fpercentageOff != null)
                return false;
        } else if (!fpercentageOff.equals(other.fpercentageOff))
            return false;
        if (foriginalPrice == null) {
            if (other.foriginalPrice != null)
                return false;
        } else if (!foriginalPrice.equals(other.foriginalPrice))
            return false;
        if (fsellingPrice == null) {
            if (other.fsellingPrice != null)
                return false;
        } else if (!fsellingPrice.equals(other.fsellingPrice))
            return false;
        if (fstatus == null) {
            if (other.fstatus != null)
                return false;
        } else if (!fstatus.equals(other.fstatus))
            return false;
        if (fcreatedAt == null) {
            if (other.fcreatedAt != null)
                return false;
        } else if (!fcreatedAt.equals(other.fcreatedAt))
            return false;
        if (fupdatedAt == null) {
            if (other.fupdatedAt != null)
                return false;
        } else if (!fupdatedAt.equals(other.fupdatedAt))
            return false;
        return true;
    }

    
}