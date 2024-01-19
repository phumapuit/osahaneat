package com.phunguyen.osahaneat.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "pass_word")
    private String password;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "created_date")
    private Date createdDate;
    @ManyToOne
    @JoinColumn(name="role_id")
    private Roles roles;

    @OneToMany(mappedBy = "user")
    private Set<RatingFood> listRatingFoods;

    @OneToMany(mappedBy = "user")
    private Set<RatingRestaurant> listRatingRes;

    @OneToMany(mappedBy = "user")
    private Set<Orders> listOrders;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}
