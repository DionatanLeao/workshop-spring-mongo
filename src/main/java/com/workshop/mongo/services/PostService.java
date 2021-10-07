package com.workshop.mongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.mongo.domain.Post;
import com.workshop.mongo.repository.PostRepository;
import com.workshop.mongo.services.exception.ObjectNotFoundException;

/***
 * 
 * @author Dionatan Leão
 *
 */

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text) {
		return repo.searchTitle(text);
	}
	
	
}
