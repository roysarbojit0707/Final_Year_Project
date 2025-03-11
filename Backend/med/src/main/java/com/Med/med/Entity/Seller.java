package com.Med.med.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Seller")
public class Seller {
    @Id
    private String mailId;
    private String username;
    private String password;
    private String name;
    private String phone;

    public Seller() {
    }

    public Seller(String mailId, String username, String password, String name, String phone) {
        this.mailId = mailId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.phone = phone;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
