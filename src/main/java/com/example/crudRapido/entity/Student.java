package com.example.crudRapido.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name="tbl_student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "username")
    private String username;
    @Column(name= "password")
    private String password;
    @Column(name= "name")
    private String name;
    @Column(name= "email")
    private String email;
    @Column(name= "isActive")
    private boolean isActive = true;
    @Column(name = "created_by")
    private String createdBy = "SYSTEM";
}
