package com.streamblog.streamblog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.streamblog.streamblog.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}