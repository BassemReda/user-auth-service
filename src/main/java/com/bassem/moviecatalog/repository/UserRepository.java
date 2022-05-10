package com.bassem.moviecatalog.repository;

import com.bassem.moviecatalog.model.User;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
    public User findByEmail(String email);

}