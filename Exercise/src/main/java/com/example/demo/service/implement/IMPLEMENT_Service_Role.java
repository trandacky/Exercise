package com.example.demo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ENTITY_Role;
import com.example.demo.repository.REPOSITORY_Role;
import com.example.demo.service.SERVICE_Role;
@Service
public class IMPLEMENT_Service_Role implements SERVICE_Role{
	
	private final REPOSITORY_Role repository_Role;
	public IMPLEMENT_Service_Role(REPOSITORY_Role repository_Role) {
		super();
		this.repository_Role=repository_Role;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ENTITY_Role> getAll() {
		// TODO Auto-generated method stub
		return repository_Role.findAll();
	}

}
