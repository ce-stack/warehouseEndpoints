package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "warehouse_locations")
public class WarehouseLocation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code" , unique = true , nullable = false)
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "zone")
    private String zone;

    @Column(name = "aisle")
    private String aisle;

    @Column(name = "shelf")
    private String shelf;

    @Column(name = "location_type")
    private String location_type;

    @Column(name = "storage_type")
    private String storage_type;


    @Column(name = "capacity")
    private Long capacity;

    @Column(name = "active")
    private boolean active;

    public WarehouseLocation() {

    }

    public WarehouseLocation(String code, String name, String zone, String aisle, String shelf, String location_type, String storage_type, Long capacity, boolean active) {
        this.code = code;
        this.name = name;
        this.zone = zone;
        this.aisle = aisle;
        this.shelf = shelf;
        this.location_type = location_type;
        this.storage_type = storage_type;
        this.capacity = capacity;
        this.active = active;
    }

    public String getCode() {
        return code;
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

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public String getStorage_type() {
        return storage_type;
    }

    public void setStorage_type(String storage_type) {
        this.storage_type = storage_type;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "WarehouseLocation{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", zone='" + zone + '\'' +
                ", aisle='" + aisle + '\'' +
                ", shelf='" + shelf + '\'' +
                ", location_type='" + location_type + '\'' +
                ", storage_type='" + storage_type + '\'' +
                ", capacity=" + capacity +
                ", active=" + active +
                '}';
    }
}
