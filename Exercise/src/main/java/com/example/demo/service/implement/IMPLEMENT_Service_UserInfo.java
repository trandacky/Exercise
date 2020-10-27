package com.example.demo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.entity.ENTITY_UserInfo;
import com.example.demo.repository.REPOSITORY_UserInfo;
import com.example.demo.service.SERVICE_UserInfo;

@Service
public class IMPLEMENT_Service_UserInfo implements SERVICE_UserInfo{
	
	private final REPOSITORY_UserInfo repository_UserInfo;
	public IMPLEMENT_Service_UserInfo(REPOSITORY_UserInfo repository_UserInfo) {
		super();
		this.repository_UserInfo=repository_UserInfo;
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<ENTITY_UserInfo> getAll() {
		// TODO Auto-generated method stub
		return repository_UserInfo.findAll();
	}

}
