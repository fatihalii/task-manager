package com.example.taskmanager.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;

    public String name;

    public String category;

    public boolean completion;

}
