package com.example.demo.controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ENTITY_Group;
import com.example.demo.service.SERVICE_Group;

@RestController
public class CONTROLER_Group {
	private final SERVICE_Group service_Group;
	 public CONTROLER_Group(SERVICE_Group service_Group)
	 {
		 super();
		 this.service_Group=service_Group;
		 
	 }
		
		@GetMapping("/viewgroup")
		public List<ENTITY_Group> get( ) {
			return service_Group.getAll();
		}
}
