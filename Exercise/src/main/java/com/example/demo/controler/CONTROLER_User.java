package com.example.demo.controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ENTITY_User;
import com.example.demo.service.SERVICE_User;


@RestController
public class CONTROLER_User {
 private final SERVICE_User service_User;
 public CONTROLER_User(SERVICE_User service_User)
 {
	 super();
	 this.service_User=service_User;
	 
 }
	
	@GetMapping("/viewuser")
	public List<ENTITY_User> get( ) {
		return service_User.getAll();
	}
}
