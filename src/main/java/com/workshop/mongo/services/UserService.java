package com.workshop.mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.mongo.domain.User;
import com.workshop.mongo.repository.UserRepository;

/***
 * 
 * @author Dionatan Leão
 *
 */

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
