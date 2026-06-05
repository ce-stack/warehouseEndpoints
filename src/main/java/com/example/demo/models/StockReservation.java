package com.example.demo.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "stock_reservations")
public class StockReservation {

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
    @JoinColumn(name = "stock_item_id")
    private StockItem stockItem;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "created_by_user_id")
    private User created_by;

    @Column(name = "quantity")
    private Long quantity;


    @Column(name = "status")
    private String status;

    @Column(name = "reservedAt")
    private LocalDateTime reservedAt;

    @Column(name = "releasedAt")
    private LocalDateTime releasedAt;

    @Column(name = "consumedAt")
    private LocalDateTime consumedAt;


    public StockReservation() {

    }

    public StockReservation(CustomerOrder customerOrder, OrderItem orderItem, StockItem stockItem, Product product, User created_by, Long quantity, String status, LocalDateTime reservedAt, LocalDateTime releasedAt, LocalDateTime consumedAt) {
        this.customerOrder = customerOrder;
        this.orderItem = orderItem;
        this.stockItem = stockItem;
        this.product = product;
        this.created_by = created_by;
        this.quantity = quantity;
        this.status = status;
        this.reservedAt = reservedAt;
        this.releasedAt = releasedAt;
        this.consumedAt = consumedAt;
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

    public User getCreated_by() {
        return created_by;
    }

    public void setCreated_by(User created_by) {
        this.created_by = created_by;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getReservedAt() {
        return reservedAt;
    }

    public void setReservedAt(LocalDateTime reservedAt) {
        this.reservedAt = reservedAt;
    }

    public LocalDateTime getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(LocalDateTime releasedAt) {
        this.releasedAt = releasedAt;
    }

    public LocalDateTime getConsumedAt() {
        return consumedAt;
    }

    public void setConsumedAt(LocalDateTime consumedAt) {
        this.consumedAt = consumedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StockReservation{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                ", reservedAt=" + reservedAt +
                ", releasedAt=" + releasedAt +
                ", consumedAt=" + consumedAt +
                '}';
    }
}
