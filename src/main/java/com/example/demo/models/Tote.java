package com.example.demo.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "totes")
public class Tote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "customer_order_id")
    private CustomerOrder customerOrder;


    @ManyToOne
    @JoinColumn(name = "currrent_station_warehouse_location_id")
    private WarehouseLocation currentStation;

    @Column(name = "status")
    private String status;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "assignedAt")
    private LocalDateTime assignedAt;

    @Column(name = "dispatchedAt")
    private LocalDateTime dispatchedAt;

    @Column(name = "blockedAt")
    private LocalDateTime blockedAt;

    @Column(name = "blockReason")
    private String blockReason;


    public Tote() {

    }

    public Tote(CustomerOrder customerOrder, WarehouseLocation currentStation, String status, LocalDateTime createdAt, LocalDateTime assignedAt, LocalDateTime dispatchedAt, LocalDateTime blockedAt, String blockReason) {
        this.customerOrder = customerOrder;
        this.currentStation = currentStation;
        this.status = status;
        this.createdAt = createdAt;
        this.assignedAt = assignedAt;
        this.dispatchedAt = dispatchedAt;
        this.blockedAt = blockedAt;
        this.blockReason = blockReason;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    public WarehouseLocation getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(WarehouseLocation currentStation) {
        this.currentStation = currentStation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getAssignedAt() {
        return assignedAt;
    }

    public void setAssignedAt(LocalDateTime assignedAt) {
        this.assignedAt = assignedAt;
    }

    public LocalDateTime getDispatchedAt() {
        return dispatchedAt;
    }

    public void setDispatchedAt(LocalDateTime dispatchedAt) {
        this.dispatchedAt = dispatchedAt;
    }

    public LocalDateTime getBlockedAt() {
        return blockedAt;
    }

    public void setBlockedAt(LocalDateTime blockedAt) {
        this.blockedAt = blockedAt;
    }

    public String getBlockReason() {
        return blockReason;
    }

    public void setBlockReason(String blockReason) {
        this.blockReason = blockReason;
    }

    @Override
    public String toString() {
        return "Tote{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                ", assignedAt=" + assignedAt +
                ", dispatchedAt=" + dispatchedAt +
                ", blockedAt=" + blockedAt +
                ", blockReason='" + blockReason + '\'' +
                '}';
    }
}
