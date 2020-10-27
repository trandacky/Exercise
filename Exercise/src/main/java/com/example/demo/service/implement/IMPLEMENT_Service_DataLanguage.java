package com.example.demo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ENTITY_DataLanguage;
import com.example.demo.repository.REPOSITORY_DataLanguage;
import com.example.demo.service.SERVICE_DataLanguage;

@Service
public class IMPLEMENT_Service_DataLanguage implements SERVICE_DataLanguage{
	private final REPOSITORY_DataLanguage repository_DataLanguage;
	public IMPLEMENT_Service_DataLanguage(REPOSITORY_DataLanguage repository_DataLanguage) {
		super();
		this.repository_DataLanguage=repository_DataLanguage;
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<ENTITY_DataLanguage> getAll() {
		// TODO Auto-generated method stub
		return repository_DataLanguage.findAll();
	}
	
	
}
