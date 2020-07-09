package com.camera.heroku.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camera.heroku.demo.entity.Users;
import com.camera.heroku.demo.repo.UserRepository;

@Service
public class UsersImpl implements UsersService {
	
	@Autowired
	UserRepository usrRepo;
	

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return usrRepo.findAll();
	}

}
