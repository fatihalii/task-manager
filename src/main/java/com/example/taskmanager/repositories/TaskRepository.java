package com.example.taskmanager.repositories;

import com.example.taskmanager.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer > {
}
