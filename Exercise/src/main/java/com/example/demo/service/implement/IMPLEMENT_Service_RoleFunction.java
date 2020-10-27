package com.example.demo.service.implement;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import com.example.demo.entity.ENTITY_RoleFunction;
import com.example.demo.repository.REPOSITORY_RoleFunction;
import com.example.demo.service.SERVICE_RoleFunction;
@Service
public class IMPLEMENT_Service_RoleFunction implements SERVICE_RoleFunction{

	private final REPOSITORY_RoleFunction repository_RoleFunction;
	public IMPLEMENT_Service_RoleFunction(REPOSITORY_RoleFunction repository_RoleFunction) {
		super();
		this.repository_RoleFunction=repository_RoleFunction;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ENTITY_RoleFunction> getAll() {
		// TODO Auto-generated method stub
		return repository_RoleFunction.findAll();
	}

	@Override
	public ENTITY_RoleFunction setData(@Valid ENTITY_RoleFunction roleFunction) {
		
		return repository_RoleFunction.save(roleFunction);
	}
	
}
