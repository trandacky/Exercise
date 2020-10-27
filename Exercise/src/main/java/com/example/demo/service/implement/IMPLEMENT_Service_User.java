package com.example.demo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ENTITY_User;
import com.example.demo.repository.REPOSITORY_User;
import com.example.demo.service.SERVICE_User;

@Service
public class IMPLEMENT_Service_User implements SERVICE_User{

	
	private final REPOSITORY_User repository_User;
	public IMPLEMENT_Service_User(REPOSITORY_User repository_User) {
		super();
		this.repository_User=repository_User;
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<ENTITY_User> getAll() {
		// TODO Auto-generated method stub
		return repository_User.findAll();
	}

}
