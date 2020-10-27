package com.example.demo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ENTITY_GroupUser;
import com.example.demo.repository.REPOSITORY_GroupUser;
import com.example.demo.service.SERVICE_GroupUser;

@Service
public class IMPLEMENT_Service_GroupUser implements SERVICE_GroupUser{
	private final REPOSITORY_GroupUser repository_GroupUser;
	public IMPLEMENT_Service_GroupUser(REPOSITORY_GroupUser repository_GroupUser) {
		super();
		this.repository_GroupUser=repository_GroupUser;
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<ENTITY_GroupUser> getAll() {
		// TODO Auto-generated method stub
		return repository_GroupUser.findAll();
	}

	
	
}
