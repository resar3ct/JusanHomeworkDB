package com.example.school.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "school")
@Data
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int amountStudents;
}
