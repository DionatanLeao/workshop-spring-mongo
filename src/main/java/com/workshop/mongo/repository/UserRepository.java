package com.workshop.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.workshop.mongo.domain.User;

/***
 * 
 * @author Dionatan Leão
 *
 */

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
