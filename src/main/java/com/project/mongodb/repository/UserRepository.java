package com.project.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.mongodb.model.User;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
