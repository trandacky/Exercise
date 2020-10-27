package com.example.demo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.entity.ENTITY_Language;
import com.example.demo.repository.REPOSITORY_Language;
import com.example.demo.service.SERVICE_Language;
@Service
public class IMPLEMENT_Service_Language implements SERVICE_Language{

	private final REPOSITORY_Language repository_Language;
	public IMPLEMENT_Service_Language(REPOSITORY_Language repository_Language) {
		super();
		this.repository_Language=repository_Language;
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<ENTITY_Language> getAll() {
		// TODO Auto-generated method stub
		return repository_Language.findAll();
	}
}
