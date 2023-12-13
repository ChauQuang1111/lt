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
public class employee {
    private int employee_id;
    private double salary;
    private String joning_date;
    private int manager_id;
    private int customer_id;
    private String ssn;
    private String name;
    private String dob;
    private String street;
    private String city;
    private String province;

    public employee(int employee_id, double salary, String joning_date, int manager_id, int customer_id, String ssn, String name, String dob, String street, String city, String province) {
        this.employee_id = employee_id;
        this.salary = salary;
        this.joning_date = joning_date;
        this.manager_id = manager_id;
        this.customer_id = customer_id;
        this.ssn = ssn;
        this.name = name;
        this.dob = dob;
        this.street = street;
        this.city = city;
        this.province = province;
    }

    public employee() {
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJoning_date() {
        return joning_date;
    }

    public void setJoning_date(String joning_date) {
        this.joning_date = joning_date;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
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