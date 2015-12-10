package com.vs.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "statuses")
public class Statuses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String status;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private Users user;

    public Statuses() {
    }

    public Statuses(String status, Users user) {
        this.status = status;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
