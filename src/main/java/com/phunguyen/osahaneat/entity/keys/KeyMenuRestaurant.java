package com.phunguyen.osahaneat.entity.keys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class KeyMenuRestaurant implements Serializable {
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "res_id")
    private int resId;

    public KeyMenuRestaurant(){}

    public KeyMenuRestaurant(int categoryId, int resId) {
        this.categoryId = categoryId;
        this.resId = resId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }
}
