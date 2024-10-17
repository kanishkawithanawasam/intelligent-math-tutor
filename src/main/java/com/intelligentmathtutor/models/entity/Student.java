package com.intelligentmathtutor.models.entity;

import jakarta.persistence.GeneratedValue;

public class Student {
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
