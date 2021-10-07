	package com.workshop.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.workshop.mongo.domain.Post;

/***
 * 
 * @author Dionatan Leão
 *
 */

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
		
	List<Post> findByTitleContainingIgnoreCase(String text);
}
