/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class customer {
    private int customer_id;
    private int credit_rating;
    private String ssn;
    private String name;
    private String dob;
    private String street;
    private String city;
    private String province;

    public customer(int customer_id, int credit_rating, String ssn, String name, String dob, String street, String city, String province) {
        this.customer_id = customer_id;
        this.credit_rating = credit_rating;
        this.ssn = ssn;
        this.name = name;
        this.dob = dob;
        this.street = street;
        this.city = city;
        this.province = province;
    }

    public customer() {
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getCredit_rating() {
        return credit_rating;
    }

    public void setCredit_rating(int credit_rating) {
        this.credit_rating = credit_rating;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

   
    
    

}
