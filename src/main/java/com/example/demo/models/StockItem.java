package com.example.demo.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "stock_items")
public class StockItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "product_id" , nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "warehouse_location_id" , nullable = false)
    private WarehouseLocation warehouseLocation;

    @Column(name = "batchNumber" , nullable = false)
    private String batchNumber;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "reservedQuantity")
    private Long reservedQuantity;

    @Column(name = "expiryDate")
    private LocalDate expiryDate;

    @Column(name = "receivedAt")
    private LocalDateTime receivedAt;

    @Column(name = "status")
    private String status;

    public StockItem(){

    }

    public StockItem(WarehouseLocation warehouseLocation, Product product, String batchNumber, Long quantity, Long reservedQuantity, LocalDate expiryDate, LocalDateTime receivedAt, String status) {
        this.warehouseLocation = warehouseLocation;
        this.product = product;
        this.batchNumber = batchNumber;
        this.quantity = quantity;
        this.reservedQuantity = reservedQuantity;
        this.expiryDate = expiryDate;
        this.receivedAt = receivedAt;
        this.status = status;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public WarehouseLocation getWarehouseLocation() {
        return warehouseLocation;
    }

    public void setWarehouseLocation(WarehouseLocation warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getReservedQuantity() {
        return reservedQuantity;
    }

    public void setReservedQuantity(Long reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LocalDateTime getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(LocalDateTime receivedAt) {
        this.receivedAt = receivedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StockItem{" +
                "id=" + id +
                ", batchNumber=" + batchNumber +
                ", quantity=" + quantity +
                ", reservedQuantity=" + reservedQuantity +
                ", expiryDate=" + expiryDate +
                ", receivedAt=" + receivedAt +
                ", status='" + status + '\'' +
                '}';
    }
}
