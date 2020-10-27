package com.example.demo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ENTITY_Group;
import com.example.demo.repository.REPOSITORY_Group;
import com.example.demo.service.SERVICE_Group;
@Service
public class IMPLEMENT_Service_Group implements SERVICE_Group{

	
	private final REPOSITORY_Group repository_Group;
	public IMPLEMENT_Service_Group(REPOSITORY_Group repository_Group) {
		super();
		this.repository_Group=repository_Group;
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<ENTITY_Group> getAll() {
		// TODO Auto-generated method stub
		return repository_Group.findAll();
	}
	
	

}
