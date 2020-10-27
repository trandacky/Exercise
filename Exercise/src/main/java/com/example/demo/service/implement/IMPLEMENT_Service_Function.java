package com.example.demo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ENTITY_Function;
import com.example.demo.repository.REPOSITORY_Function;
import com.example.demo.service.SERVICE_Function;
@Service
public class IMPLEMENT_Service_Function implements SERVICE_Function{

	
	
	private final REPOSITORY_Function repository_Function;
	public IMPLEMENT_Service_Function(REPOSITORY_Function repository_Function) {
		super();
		this.repository_Function=repository_Function;
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<ENTITY_Function> getAll() {
		// TODO Auto-generated method stub
		return repository_Function.findAll();
	}

}
