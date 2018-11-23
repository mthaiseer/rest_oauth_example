package com.oauth.example.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.oauth.example.data.entities.User;
import java.lang.String;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	User findByName(String name);

}
