package com.example.viatabloid2.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "storie")
public class Storie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private int departmentId;

    public Storie(String title, String description, int departmentId) {
        this.title = title;
        this.description = description;
        this.departmentId = departmentId;
    }

    public Storie() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}
