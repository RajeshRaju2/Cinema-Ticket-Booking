package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.UserDao;
import com.mph.entity.User;

@Transactional
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	
	@Override
	public void addUser(User user) {
		
		userDao.addUser(user);
	}

	@Override
	public List<User> getAllUser() {
		
		return userDao.getAllUser();
	}

	@Override
	public User validateUser(String email,String password) {
		
		return userDao.validateUser(email, password);
	}

	@Override
	public List<User> updateUser(User user) {
		
		return userDao.updateUser(user);
	}

	@Override
	public List<User> deleteUser(int uid) {
		
		return userDao.deleteUser(uid);
	}

	@Override
	public User getUserById(int uid) {
		
		return userDao.getUserById(uid);
	}



}
