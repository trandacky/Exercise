package com.example.demo.controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.ENTITY_GroupUser;
import com.example.demo.service.SERVICE_GroupUser;
@RestController
public class CONTROLER_GroupUser {
	
	private final SERVICE_GroupUser service_GroupUser;
	 public CONTROLER_GroupUser(SERVICE_GroupUser service_GroupUser)
	 {
		 super();
		 this.service_GroupUser=service_GroupUser;
		 
	 }
		
		@GetMapping("/viewgroupuser")
		public List<ENTITY_GroupUser> get( ) {
			return service_GroupUser.getAll();
		}

}
