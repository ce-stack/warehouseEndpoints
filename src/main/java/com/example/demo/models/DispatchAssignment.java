package com.example.demo.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "dispatch_assignments")
public class DispatchAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "dispatch_wave_id")
    private DispatchWave dispatchWave;

    @ManyToOne
    @JoinColumn(name = "customer_order_id")
    private CustomerOrder customerOrder;

    @ManyToOne
    @JoinColumn(name = "tote_id")
    private Tote tote;

    @ManyToOne
    @JoinColumn(name = "assigned_by_user_id")
    private User assignedBy;

    @ManyToOne
    @JoinColumn(name = "loaded_by_user_id")
    private User loadedBy;

    @Column(name = "status")
    private String status;

    @Column(name = "assignedAt")
    private LocalDateTime assignedAt;

    @Column(name = "loadedAt")
    private LocalDateTime loadedAt;

    @Column(name = "cancelledAt")
    private LocalDateTime cancelledAt;

    public DispatchAssignment() {

    }

    public DispatchAssignment(DispatchWave dispatchWave, CustomerOrder customerOrder, Tote tote, User assignedBy, User loadedBy, String status, LocalDateTime assignedAt, LocalDateTime loadedAt, LocalDateTime cancelledAt) {
        this.dispatchWave = dispatchWave;
        this.customerOrder = customerOrder;
        this.tote = tote;
        this.assignedBy = assignedBy;
        this.loadedBy = loadedBy;
        this.status = status;
        this.assignedAt = assignedAt;
        this.loadedAt = loadedAt;
        this.cancelledAt = cancelledAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DispatchWave getDispatchWave() {
        return dispatchWave;
    }

    public void setDispatchWave(DispatchWave dispatchWave) {
        this.dispatchWave = dispatchWave;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    public Tote getTote() {
        return tote;
    }

    public void setTote(Tote tote) {
        this.tote = tote;
    }

    public User getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(User assignedBy) {
        this.assignedBy = assignedBy;
    }

    public User getLoadedBy() {
        return loadedBy;
    }

    public void setLoadedBy(User loadedBy) {
        this.loadedBy = loadedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getAssignedAt() {
        return assignedAt;
    }

    public void setAssignedAt(LocalDateTime assignedAt) {
        this.assignedAt = assignedAt;
    }

    public LocalDateTime getLoadedAt() {
        return loadedAt;
    }

    public void setLoadedAt(LocalDateTime loadedAt) {
        this.loadedAt = loadedAt;
    }

    public LocalDateTime getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(LocalDateTime cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    @Override
    public String toString() {
        return "DispatchAssignment{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", assignedAt=" + assignedAt +
                ", loadedAt=" + loadedAt +
                ", cancelledAt=" + cancelledAt +
                '}';
    }
}
