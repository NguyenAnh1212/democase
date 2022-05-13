package com.example.democ12jwt.model;

import javax.persistence.*;

@Entity
@Table(name = "genders")
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Gender(String gender) {
        this.gender = gender;
    }

    public Gender(Long id, String gender) {
        this.id = id;
        this.gender = gender;
    }

    public Gender() {
    }
}
