package com.example.democ12jwt.model;

import javax.persistence.*;

@Entity
@Table(name = "services")
public class AppService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppService(String name) {
        this.name = name;
    }

    public AppService(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public AppService() {
    }


}