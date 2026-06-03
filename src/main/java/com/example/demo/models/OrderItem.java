package com.example.demo.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "customer_order_id")
    private CustomerOrder customerOrder;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "reservedQuantity")
    private String reservedQuantity;

    @Column(name = "pickedQuantity")
    private Long pickedQuantity;

    @Column(name = "unitPrice")
    private double unitPrice;

    @Column(name = "status")
    private String status;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    public OrderItem() {

    }

    public OrderItem(CustomerOrder customerOrder, Product product, Long quantity, String reservedQuantity, Long pickedQuantity, double unitPrice, String status, LocalDateTime createdAt) {
        this.customerOrder = customerOrder;
        this.product = product;
        this.quantity = quantity;
        this.reservedQuantity = reservedQuantity;
        this.pickedQuantity = pickedQuantity;
        this.unitPrice = unitPrice;
        this.status = status;
        this.createdAt = createdAt;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getReservedQuantity() {
        return reservedQuantity;
    }

    public void setReservedQuantity(String reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    public Long getPickedQuantity() {
        return pickedQuantity;
    }

    public void setPickedQuantity(Long pickedQuantity) {
        this.pickedQuantity = pickedQuantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", reservedQuantity='" + reservedQuantity + '\'' +
                ", pickedQuantity=" + pickedQuantity +
                ", unitPrice=" + unitPrice +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
