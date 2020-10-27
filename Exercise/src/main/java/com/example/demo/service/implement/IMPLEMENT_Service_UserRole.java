package com.example.demo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ENTITY_UserRole;
import com.example.demo.repository.REPOSITORY_UserRole;
import com.example.demo.service.SERVICE_UserRole;
@Service
public class IMPLEMENT_Service_UserRole implements SERVICE_UserRole{
	private final REPOSITORY_UserRole repository_UserRole;
	public IMPLEMENT_Service_UserRole(REPOSITORY_UserRole repository_UserRole) {
		super();
		this.repository_UserRole=repository_UserRole;
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<ENTITY_UserRole> getAll() {
		// TODO Auto-generated method stub
		return repository_UserRole.findAll();
	}
	
}
