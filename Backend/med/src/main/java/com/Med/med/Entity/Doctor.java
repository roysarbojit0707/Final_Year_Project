package com.Med.med.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor {
    @Id
    private String gmail;
    private String username;
    private String password;
    private String name;
    private int age;
    private String ph;
    private String gender;
    private String specialist;
    private String chamberLocation;

    public Doctor() {
    }

    public Doctor(String gmail, String username, String password, String name, int age, String ph, String gender, String specialist, String chamberLocation) {
        this.gmail = gmail;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.ph = ph;
        this.gender = gender;
        this.specialist = specialist;
        this.chamberLocation = chamberLocation;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getChamberLocation() {
        return chamberLocation;
    }

    public void setChamberLocation(String chamberLocation) {
        this.chamberLocation = chamberLocation;
    }
}
