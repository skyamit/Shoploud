package com.example.Shoploud.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TADMIN")
public class Tadmin {

    @Id
    @GeneratedValue
    private Long fid;

    @Column(name = "fname")
    private String fname;

    @Column(name = "femail")
    private String femail;

    @Column(name = "fpassword")
    private String fpassword;

    @Column(name = "frole")
    private String frole;

    @Column(name = "fstatus")
    private Integer fstatus;

    @Column(name = "fcreated_at")
    private String fcreatedAt;

    @Column(name = "fupdated_at")
    private String fupdatedAt;

    public Tadmin() {
    }

    public Tadmin(Long fid, String fname, String femail, String fpassword, String frole, Integer fstatus,
            String fcreatedAt, String fupdatedAt) {
        this.fid = fid;
        this.fname = fname;
        this.femail = femail;
        this.fpassword = fpassword;
        this.frole = frole;
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

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFemail() {
        return femail;
    }

    public void setFemail(String femail) {
        this.femail = femail;
    }

    public String getFpassword() {
        return fpassword;
    }

    public void setFpassword(String fpassword) {
        this.fpassword = fpassword;
    }

    public String getFrole() {
        return frole;
    }

    public void setFrole(String frole) {
        this.frole = frole;
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
        return "{fid=" + fid + ", fname=" + fname + ", femail=" + femail + ", fpassword=" + fpassword
                + ", frole=" + frole + ", fstatus=" + fstatus + ", fcreatedAt=" + fcreatedAt + ", fupdatedAt="
                + fupdatedAt + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fid == null) ? 0 : fid.hashCode());
        result = prime * result + ((fname == null) ? 0 : fname.hashCode());
        result = prime * result + ((femail == null) ? 0 : femail.hashCode());
        result = prime * result + ((fpassword == null) ? 0 : fpassword.hashCode());
        result = prime * result + ((frole == null) ? 0 : frole.hashCode());
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
        Tadmin other = (Tadmin) obj;
        if (fid == null) {
            if (other.fid != null)
                return false;
        } else if (!fid.equals(other.fid))
            return false;
        if (fname == null) {
            if (other.fname != null)
                return false;
        } else if (!fname.equals(other.fname))
            return false;
        if (femail == null) {
            if (other.femail != null)
                return false;
        } else if (!femail.equals(other.femail))
            return false;
        if (fpassword == null) {
            if (other.fpassword != null)
                return false;
        } else if (!fpassword.equals(other.fpassword))
            return false;
        if (frole == null) {
            if (other.frole != null)
                return false;
        } else if (!frole.equals(other.frole))
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
