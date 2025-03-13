package com.Med.med.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Medicine")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String discount;
    private float price;
    private String medicineType;
    private String quantity;
    private String mrp;
    private String description;
    private String uses;
    private String sideEffect;
    private String therapy;
    private String warning;
    private String sellerUsername;

    public Medicine() {
    }

    public Medicine(String name, String discount, float price, String medicineType, String quantity, String mrp, String description, String uses, String sideEffect, String therapy, String warning, String sellerUsername) {
        this.id = id;
        this.name = name;
        this.discount = discount;
        this.price = price;
        this.medicineType = medicineType;
        this.quantity = quantity;
        this.mrp = mrp;
        this.description = description;
        this.uses = uses;
        this.sideEffect = sideEffect;
        this.therapy = therapy;
        this.warning = warning;
        this.sellerUsername = sellerUsername;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSellerName() {
        return sellerUsername;
    }

    public void setSellerName(String sellerName) {
        sellerUsername = sellerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getMrp() {
        return mrp;
    }

    public void setMrp(String mrp) {
        this.mrp = mrp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }

    public String getSideEffect() {
        return sideEffect;
    }

    public void setSideEffect(String sideEffect) {
        this.sideEffect = sideEffect;
    }

    public String getTherapy() {
        return therapy;
    }

    public void setTherapy(String therapy) {
        this.therapy = therapy;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }
}
