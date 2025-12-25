package com.example.rest_service.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.rest_service.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
    
}