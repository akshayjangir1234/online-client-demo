package com.example.client.model;

import jakarta.persistence.*;

@Entity
@Table
public class BusRouteDetailsModel {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer busId;

    @Column
    private String busName;

    @Column
    private String busRoute;

    @Column
    private String busTiming;

    @Column
    private float busFair;

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusRoute() {
        return busRoute;
    }

    public void setBusRoute(String busRoute) {
        this.busRoute = busRoute;
    }

    public String getBusTiming() {
        return busTiming;
    }

    public void setBusTiming(String busTiming) {
        this.busTiming = busTiming;
    }

    public float getBusFair() {
        return busFair;
    }

    public void setBusFair(float busFair) {
        this.busFair = busFair;
    }
}
