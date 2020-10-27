package com.example.demo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.entity.ENTITY_UserInfoLanguage;
import com.example.demo.repository.REPOSITORY_UserInfoLanguage;
import com.example.demo.service.SERVICE_UserInfoLanguage;
@Service
public class IMPLEMENT_Service_UserInfoLanguage implements SERVICE_UserInfoLanguage{
	private final REPOSITORY_UserInfoLanguage repository_UserInfoLanguage;
	public IMPLEMENT_Service_UserInfoLanguage(REPOSITORY_UserInfoLanguage repository_UserInfo) {
		super();
		this.repository_UserInfoLanguage=repository_UserInfo;
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<ENTITY_UserInfoLanguage> getAll() {
		// TODO Auto-generated method stub
		return repository_UserInfoLanguage.findAll();
}
}
