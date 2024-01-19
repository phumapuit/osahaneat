package com.phunguyen.osahaneat.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "subtitle")
    private String subtitle;
    @Column(name = "description")
    private String description;
    @Column(name = "image")
    private String image;
    @Column(name = "is_freeship")
    private boolean isFreeship;
    @Column(name = "address")
    private String address;
    @Column(name = "open_date")
    private Date openDate;

    @OneToMany(mappedBy = "restaurant")
    private Set<RatingRestaurant> listRatingRes;

    @OneToMany(mappedBy = "restaurant")
    private Set<Orders> listOrders;

    @OneToMany(mappedBy = "res")
    private Set<MenuRestaurant> listMenuRes;

    @OneToMany(mappedBy = "res")
    private Set<Promo> listPromos;

    public Set<Promo> getListPromos() {
        return listPromos;
    }

    public void setListPromos(Set<Promo> listPromos) {
        this.listPromos = listPromos;
    }

    public Set<MenuRestaurant> getListMenuRes() {
        return listMenuRes;
    }

    public void setListMenuRes(Set<MenuRestaurant> listMenuRes) {
        this.listMenuRes = listMenuRes;
    }

    public Set<Orders> getListOrders() {
        return listOrders;
    }

    public void setListOrders(Set<Orders> listOrders) {
        this.listOrders = listOrders;
    }

    public Set<RatingRestaurant> getListRatingRes() {
        return listRatingRes;
    }

    public void setListRatingRes(Set<RatingRestaurant> listRatingRes) {
        this.listRatingRes = listRatingRes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isFreeship() {
        return isFreeship;
    }

    public void setFreeship(boolean freeship) {
        isFreeship = freeship;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }
}
