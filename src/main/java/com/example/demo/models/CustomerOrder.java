package com.example.demo.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "customer_orders")
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "orderNumber")
    private Long orderNumber;

    @Column(name = "customerName")
    private String customerName;

    @Column(name = "customerPhone")
    private String customerPhone;

    @Column(name = "status")
    private String status;

    @Column(name = "totalItems")
    private Long totalItems;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "reservedAt")
    private  LocalDateTime reservedAt;

    @Column(name = "pickedAt")
    private LocalDateTime pickedAt;

    @Column(name = "readyForDispatchAt")
    private LocalDateTime readyForDispatchAt;

    @Column(name = "dispatchedAt")
    private LocalDateTime dispatchedAt;

    @Column(name = "cancelledAt")
    private LocalDateTime cancelledAt;

    @ManyToOne
    @JoinColumn(name = "created_by_user_id")
    private User createdBy;

    @OneToMany(mappedBy = "customerOrder")
    private List<OrderItem> orderItems;

    public CustomerOrder() {

    }

    public CustomerOrder(Long orderNumber, String customerName, String customerPhone, String status, Long totalItems, LocalDateTime createdAt, LocalDateTime reservedAt, LocalDateTime pickedAt, LocalDateTime readyForDispatchAt, LocalDateTime dispatchedAt, LocalDateTime cancelledAt, User createdBy, List<OrderItem> orderItems) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.status = status;
        this.totalItems = totalItems;
        this.createdAt = createdAt;
        this.reservedAt = reservedAt;
        this.pickedAt = pickedAt;
        this.readyForDispatchAt = readyForDispatchAt;
        this.dispatchedAt = dispatchedAt;
        this.cancelledAt = cancelledAt;
        this.createdBy = createdBy;
        this.orderItems = orderItems;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getReservedAt() {
        return reservedAt;
    }

    public void setReservedAt(LocalDateTime reservedAt) {
        this.reservedAt = reservedAt;
    }

    public LocalDateTime getPickedAt() {
        return pickedAt;
    }

    public void setPickedAt(LocalDateTime pickedAt) {
        this.pickedAt = pickedAt;
    }

    public LocalDateTime isReadyForDispatchAt() {
        return readyForDispatchAt;
    }

    public void setReadyForDispatchAt(LocalDateTime readyForDispatchAt) {
        this.readyForDispatchAt = readyForDispatchAt;
    }

    public LocalDateTime getDispatchedAt() {
        return dispatchedAt;
    }

    public void setDispatchedAt(LocalDateTime dispatchedAt) {
        this.dispatchedAt = dispatchedAt;
    }

    public LocalDateTime getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(LocalDateTime cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "id=" + id +
                ", orderNumber=" + orderNumber +
                ", customerName='" + customerName + '\'' +
                ", customerPhone=" + customerPhone +
                ", status='" + status + '\'' +
                ", totalItems=" + totalItems +
                ", createdAt=" + createdAt +
                ", reservedAt=" + reservedAt +
                ", pickedAt=" + pickedAt +
                ", readyForDispatchAt=" + readyForDispatchAt +
                ", dispatchedAt=" + dispatchedAt +
                ", cancelledAt=" + cancelledAt +
                '}';
    }
}
