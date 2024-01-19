package com.phunguyen.osahaneat.entity;

import com.phunguyen.osahaneat.entity.keys.KeyOrdersItem;
import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "orders_item")
public class OrdersItem {
    @EmbeddedId
    KeyOrdersItem keys;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "food_id", insertable = false, updatable = false)
    private Food food;

    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "price")
    private double price;

    public KeyOrdersItem getKeys() {
        return keys;
    }

    public void setKeys(KeyOrdersItem keys) {
        this.keys = keys;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
