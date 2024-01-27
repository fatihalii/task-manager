package com.example.taskmanager.repositories;

import com.example.taskmanager.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer > {
}
