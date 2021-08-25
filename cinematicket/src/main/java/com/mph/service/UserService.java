package com.mph.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mph.entity.User;


@Service
public interface UserService {
	public void addUser(User user);
	public List<User> getAllUser();
	public User validateUser(String email,String password);
	public List<User> updateUser(User user);
	public List<User> deleteUser(int uid);
	
	public User getUserById(int uid);
}