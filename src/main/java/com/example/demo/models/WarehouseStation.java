package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "warehouse_stations")
public class WarehouseStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code" , unique = true)
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "stationType")
    private String stationType;

    @Column(name = "sequenceOrder")
    private Long sequenceOrder;

    @Column(name = "active")
    private boolean active;

    public WarehouseStation(){

    }

    public WarehouseStation(String code, String name, String stationType, Long sequenceOrder, boolean active) {
        this.code = code;
        this.name = name;
        this.stationType = stationType;
        this.sequenceOrder = sequenceOrder;
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

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public Long getSequenceOrder() {
        return sequenceOrder;
    }

    public void setSequenceOrder(Long sequenceOrder) {
        this.sequenceOrder = sequenceOrder;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "WarehouseStation{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", stationType='" + stationType + '\'' +
                ", sequenceOrder=" + sequenceOrder +
                ", active=" + active +
                '}';
    }
}
