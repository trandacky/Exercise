package com.example.demo.controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.ENTITY_UserRole;
import com.example.demo.service.SERVICE_UserRole;

@RestController
public class CONTROLER_UserRole {
	private final SERVICE_UserRole service_UserRole;
	 public CONTROLER_UserRole(SERVICE_UserRole service_UserRole)
	 {
		 super();
		 this.service_UserRole=service_UserRole;
		 
	 }
		
		@GetMapping("/viewuserrole")
		public List<ENTITY_UserRole> get( ) {
			return service_UserRole.getAll();
		}

}
