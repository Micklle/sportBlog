package com.sport.blog.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sport.blog.dao.UserDAO;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Inject
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		com.sport.blog.model.User user = userDAO.getUserByName(name);
		
		if (user == null) {
			throw new UsernameNotFoundException("Don`t find user");
		}
		Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(user.getRole().getName()));
		return new User(user.getId().toString(), user.getPassword(), authorities);
	}

}
