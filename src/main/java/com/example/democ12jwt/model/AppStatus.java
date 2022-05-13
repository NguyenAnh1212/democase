package com.example.democ12jwt.model;

import javax.persistence.*;

@Entity
@Table(name = "status")
public class AppStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean status;

    public AppStatus(Long id, boolean status) {
        this.id = id;
        this.status = status;
    }

    public AppStatus() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
