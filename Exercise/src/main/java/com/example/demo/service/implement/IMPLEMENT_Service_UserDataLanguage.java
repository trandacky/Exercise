package com.example.demo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ENTITY_UserDataLanguage;
import com.example.demo.repository.REPOSITORY_UserDataLanguage;
import com.example.demo.service.SERVICE_UserDataLanguage;
@Service
public class IMPLEMENT_Service_UserDataLanguage implements SERVICE_UserDataLanguage{
	
	
	private final REPOSITORY_UserDataLanguage repository_UserDataLanguage;
	public IMPLEMENT_Service_UserDataLanguage(REPOSITORY_UserDataLanguage repository_UserDataLanguage) {
		super();
		this.repository_UserDataLanguage=repository_UserDataLanguage;
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<ENTITY_UserDataLanguage> getAll() {
		// TODO Auto-generated method stub
		return repository_UserDataLanguage.findAll();
	}

}
