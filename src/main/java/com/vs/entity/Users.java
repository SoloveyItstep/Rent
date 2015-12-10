package com.vs.entity;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "user")
    private List<RentProducts> rentProductsList;

    @OneToMany(mappedBy = "user")
    private List<Statuses> statuses;

    public Users() {
    }

    public Users(String first_name, String last_name,
                 String email, String phone,
                 List<RentProducts> rentProductsList, List<Statuses> statuses) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.rentProductsList = rentProductsList;
        this.statuses = statuses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<RentProducts> getRentProductsList() {
        return rentProductsList;
    }

    public void setRentProductsList(List<RentProducts> rentProductsList) {
        this.rentProductsList = rentProductsList;
    }

    public List<Statuses> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Statuses> statuses) {
        this.statuses = statuses;
    }
}
