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
public class savingAccount {
    private int account_number;
    private int customer_id;
    private Date last_access_date;

    public savingAccount(int account_number, int customer_id, Date last_access_date) {
        this.account_number = account_number;
        this.customer_id = customer_id;
        this.last_access_date = last_access_date;
    }

    public savingAccount() {
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Date getLast_access_date() {
        return last_access_date;
    }

    public void setLast_access_date(Date last_access_date) {
        this.last_access_date = last_access_date;
    }
    
    
}
