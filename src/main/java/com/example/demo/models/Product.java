package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "sku" ,unique = true)
    private String sku;

    @Column(name = "barcode" , unique = true)
    private String barcode;

    @Column(name = "description")
    private String description;

    @Column(name = "unit")
    private String unit;

    @Column(name = "storageType")
    private String storageType;

    @Column(name = "active")
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "category_id" , nullable = false)
    private Category category;

    public Product(){

    }

    public Product(String name, String sku, String barcode, String description, String unit, String storageType, boolean active, Category category) {
        this.name = name;
        this.sku = sku;
        this.barcode = barcode;
        this.description = description;
        this.unit = unit;
        this.storageType = storageType;
        this.active = active;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                ", barcode='" + barcode + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", storageType='" + storageType + '\'' +
                ", active=" + active +
                '}';
    }
}
