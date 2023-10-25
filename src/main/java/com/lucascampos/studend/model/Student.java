package com.lucascampos.studend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String email;
    private Boolean status;

    public Student(String firstName, String lastName, String email, Boolean status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.status = status;
    }
}