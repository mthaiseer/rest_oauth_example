package com.oauth.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.oauth.example.data.entities.User;
import com.oauth.example.data.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	private User user;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

		user = userRepository.findByName(name);
		return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(),
				user.getRoles());
	}

}
