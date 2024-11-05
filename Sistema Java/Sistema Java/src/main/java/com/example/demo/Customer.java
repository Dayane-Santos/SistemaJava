package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String name;
    private String fantasyname;
    private String taxcode;
    private String phone;
    private String status;

    // Construtores, getters e setters
    public Customer() {}

    public Customer(String code, String name, String fantasyname, String taxcode, String phone, String status) {
        this.code = code;
        this.name = name;
        this.fantasyname = fantasyname;
        this.taxcode = taxcode;
        this.phone = phone;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFantasyname() {
        return fantasyname;
    }

    public void setFantasyname(String fantasyname) {
        this.fantasyname = fantasyname;
    }

    public String getTaxcode() {
        return taxcode;
    }

    public void setTaxcode(String taxcode) {
        this.taxcode = taxcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return phone;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}