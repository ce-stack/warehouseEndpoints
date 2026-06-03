package com.example.demo.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "stock_movements")
public class StockMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "stock_item_id" , nullable = false)
    private StockItem stockItem;

    @ManyToOne
    @JoinColumn(name = "product_id" , nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "warehouse_location_id" , nullable = false)
    private WarehouseLocation warehouseLocation;

    @ManyToOne
    @JoinColumn(name = "customer_order_id" , nullable = true)
    private CustomerOrder customerOrder;

    @Column(name = "movementType")
    private String movementType;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "previousQuantity")
    private Long previousQuantity;

    @Column(name = "newQuantity")
    private Long newQuantity;

    @Column(name = "reason")
    private String reason;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "created_by_user_id")
    private User createdBy;

    public StockMovement() {

    }

    public StockMovement(StockItem stockItem, Product product, WarehouseLocation warehouseLocation, CustomerOrder customerOrder, String movementType, Long quantity, Long previousQuantity, Long newQuantity, String reason, LocalDateTime createdAt, User createdBy) {
        this.stockItem = stockItem;
        this.product = product;
        this.warehouseLocation = warehouseLocation;
        this.customerOrder = customerOrder;
        this.movementType = movementType;
        this.quantity = quantity;
        this.previousQuantity = previousQuantity;
        this.newQuantity = newQuantity;
        this.reason = reason;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public StockItem getStockItem() {
        return stockItem;
    }

    public void setStockItem(StockItem stockItem) {
        this.stockItem = stockItem;
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

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getPreviousQuantity() {
        return previousQuantity;
    }

    public void setPreviousQuantity(Long previousQuantity) {
        this.previousQuantity = previousQuantity;
    }

    public Long getNewQuantity() {
        return newQuantity;
    }

    public void setNewQuantity(Long newQuantity) {
        this.newQuantity = newQuantity;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "StockMovement{" +
                "id=" + id +
                ", stockItem=" + stockItem +
                ", movementType='" + movementType + '\'' +
                ", quantity=" + quantity +
                ", previousQuantity=" + previousQuantity +
                ", newQuantity=" + newQuantity +
                ", reason='" + reason + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
