package com.example.demo.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "picking_tasks")
public class PickingTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @ManyToOne
    @JoinColumn(name = "customer_order_id")
    private CustomerOrder customerOrder;

    @ManyToOne
    @JoinColumn(name = "order_item_id")
    private OrderItem orderItem;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "assigned_picker_user_id")
    private User assignedPicker;

    @ManyToOne
    @JoinColumn(name = "tote_id")
    private Tote tote;

    @ManyToOne
    @JoinColumn(name = "warehouse_location_id")
    private WarehouseLocation warehouseLocation;

    @Column(name = "quantityToPick")
    private Long quantityToPick;


    @Column(name = "pickedQuantity")
    private Long pickedQuantity;

    @Column(name = "status")
    private String status;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "canceledAt")
    private LocalDateTime canceledAt;

    @Column(name = "completedAt")
    private LocalDateTime completedAt;

    @Column(name = "startedAt")
    private LocalDateTime startedAt;

    public PickingTask() {

    }

    public PickingTask(CustomerOrder customerOrder, OrderItem orderItem, Product product, User assignedPicker, Tote tote, WarehouseLocation warehouseLocation, Long quantityToPick, Long pickedQuantity, String status, LocalDateTime createdAt, LocalDateTime canceledAt, LocalDateTime completedAt, LocalDateTime startedAt) {
        this.customerOrder = customerOrder;
        this.orderItem = orderItem;
        this.product = product;
        this.assignedPicker = assignedPicker;
        this.tote = tote;
        this.warehouseLocation = warehouseLocation;
        this.quantityToPick = quantityToPick;
        this.pickedQuantity = pickedQuantity;
        this.status = status;
        this.createdAt = createdAt;
        this.canceledAt = canceledAt;
        this.completedAt = completedAt;
        this.startedAt = startedAt;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getAssignedPicker() {
        return assignedPicker;
    }

    public void setAssignedPicker(User assignedPicker) {
        this.assignedPicker = assignedPicker;
    }

    public Tote getTote() {
        return tote;
    }

    public void setTote(Tote tote) {
        this.tote = tote;
    }

    public WarehouseLocation getWarehouseLocation() {
        return warehouseLocation;
    }

    public void setWarehouseLocation(WarehouseLocation warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    public Long getQuantityToPick() {
        return quantityToPick;
    }

    public void setQuantityToPick(Long quantityToPick) {
        this.quantityToPick = quantityToPick;
    }

    public Long getPickedQuantity() {
        return pickedQuantity;
    }

    public void setPickedQuantity(Long pickedQuantity) {
        this.pickedQuantity = pickedQuantity;
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

    public LocalDateTime getCanceledAt() {
        return canceledAt;
    }

    public void setCanceledAt(LocalDateTime canceledAt) {
        this.canceledAt = canceledAt;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(LocalDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
