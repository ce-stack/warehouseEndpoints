package com.example.demo.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tote_movements")
public class ToteMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "tote_id")
    private Tote tote;

    @ManyToOne
    @JoinColumn(name = "from_station_warehouse_station_id")
    private WarehouseStation fromStation;

    @ManyToOne
    @JoinColumn(name = "to_station_warehouse_station_id")
    private WarehouseStation toStation;

    @ManyToOne
    @JoinColumn(name = "move_by_user_id")
    private User movedBy;

    @Column(name = "status")
    private String status;

    @Column(name = "movedAt")
    private LocalDateTime movedAt;

    @Column(name = "arrivedAt")
    private LocalDateTime arrivedAt;

    public ToteMovement() {

    }

    public ToteMovement(Tote tote, WarehouseStation fromStation, WarehouseStation toStation, User movedBy, String status, LocalDateTime movedAt, LocalDateTime arrivedAt) {
        this.tote = tote;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.movedBy = movedBy;
        this.status = status;
        this.movedAt = movedAt;
        this.arrivedAt = arrivedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tote getTote() {
        return tote;
    }

    public void setTote(Tote tote) {
        this.tote = tote;
    }

    public WarehouseStation getFromStation() {
        return fromStation;
    }

    public void setFromStation(WarehouseStation fromStation) {
        this.fromStation = fromStation;
    }

    public WarehouseStation getToStation() {
        return toStation;
    }

    public void setToStation(WarehouseStation toStation) {
        this.toStation = toStation;
    }

    public User getMovedBy() {
        return movedBy;
    }

    public void setMovedBy(User movedBy) {
        this.movedBy = movedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getMovedAt() {
        return movedAt;
    }

    public void setMovedAt(LocalDateTime movedAt) {
        this.movedAt = movedAt;
    }

    public LocalDateTime getArrivedAt() {
        return arrivedAt;
    }

    public void setArrivedAt(LocalDateTime arrivedAt) {
        this.arrivedAt = arrivedAt;
    }

    @Override
    public String toString() {
        return "ToteMovement{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", movedAt=" + movedAt +
                ", arrivedAt=" + arrivedAt +
                '}';
    }
}
