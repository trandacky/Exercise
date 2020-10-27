package com.example.demo.controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.ENTITY_UserInfo;
import com.example.demo.service.SERVICE_UserInfo;

@RestController
public class CONTROLER_UserInfo {
	private final SERVICE_UserInfo service_UserInfo;
	 public CONTROLER_UserInfo(SERVICE_UserInfo service_UserInfo)
	 {
		 super();
		 this.service_UserInfo=service_UserInfo;
		 
	 }
		
		@GetMapping("/viewuserinfo")
		public List<ENTITY_UserInfo> getAccount( ) {
			return service_UserInfo.getAll();
		}
	

}
