package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.pojo.User;
import com.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
	private UserMapper usermapper;
	@Override
	public User logincheck(User user) {
		// TODO Auto-generated method stub
		User u=usermapper.logincheck(user);
		return u;
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
        usermapper.register(user);
	}

}
