package com.phunguyen.osahaneat.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name_category")
    private String nameCategory;
    @Column(name = "created_date")
    private Date createdDate;

    @OneToMany(mappedBy = "category")
    private Set<Food> listFoods;

    @OneToMany(mappedBy = "category")
    private Set<MenuRestaurant> listMenuRes;

    public Set<MenuRestaurant> getListMenuRes() {
        return listMenuRes;
    }

    public void setListMenuRes(Set<MenuRestaurant> listMenuRes) {
        this.listMenuRes = listMenuRes;
    }

    public Set<Food> getListFoods() {
        return listFoods;
    }

    public void setListFoods(Set<Food> listFoods) {
        this.listFoods = listFoods;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
