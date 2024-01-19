package com.phunguyen.osahaneat.entity;

import com.phunguyen.osahaneat.entity.keys.KeyMenuRestaurant;
import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "menu_restaurant")
public class MenuRestaurant {
    @EmbeddedId
    KeyMenuRestaurant keys;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "res_id", insertable = false, updatable = false)
    private Restaurant res;

    @Column(name = "created_date")
    private Date createdDate;

    public KeyMenuRestaurant getKeys() {
        return keys;
    }

    public void setKeys(KeyMenuRestaurant keys) {
        this.keys = keys;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Restaurant getRes() {
        return res;
    }

    public void setRes(Restaurant res) {
        this.res = res;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
