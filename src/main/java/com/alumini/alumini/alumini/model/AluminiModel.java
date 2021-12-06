package com.alumini.alumini.alumini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AluminiModel {
    @Id
    @Column
    private String id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String mobile;
    @Column
    private String company;
    @Column
    private String designation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public AluminiModel(String id, String name, String email, String mobile, String company, String designation) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.company = company;
        this.designation = designation;
    }

    public AluminiModel() {
    }
}
