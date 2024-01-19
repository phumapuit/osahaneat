package com.phunguyen.osahaneat.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "image")
    private String image;
    @Column(name = "time_ship")
    private String time_ship;
    @Column(name = "price")
    private double price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "food")
    private Set<RatingFood> listRatingFoods;

    @OneToMany(mappedBy = "food")
    private Set<OrdersItem> listOrdersItem;

    public Set<OrdersItem> getListOrdersItem() {
        return listOrdersItem;
    }

    public void setListOrdersItem(Set<OrdersItem> listOrdersItem) {
        this.listOrdersItem = listOrdersItem;
    }

    public Set<RatingFood> getListRatingFoods() {
        return listRatingFoods;
    }

    public void setListRatingFoods(Set<RatingFood> listRatingFoods) {
        this.listRatingFoods = listRatingFoods;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTime_ship() {
        return time_ship;
    }

    public void setTime_ship(String time_ship) {
        this.time_ship = time_ship;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
