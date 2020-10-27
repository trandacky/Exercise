package com.example.demo.controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ENTITY_Role;
import com.example.demo.service.SERVICE_Role;

@RestController
public class CONTROLER_Role {
	
	private final SERVICE_Role service_Role;
	 public CONTROLER_Role(SERVICE_Role service_Role)
	 {
		 super();
		 this.service_Role=service_Role;
		 
	 }
		
		@GetMapping("/viewrole")
		public List<ENTITY_Role> get( ) {
			return service_Role.getAll();
		}

}
