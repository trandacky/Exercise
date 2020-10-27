package com.example.demo.controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ENTITY_Function;
import com.example.demo.service.SERVICE_Function;
@RestController
public class CONTROLER_Function {
	
	
	private final SERVICE_Function service_Function;
	 public CONTROLER_Function(SERVICE_Function service_Function)
	 {
		 super();
		 this.service_Function=service_Function;
		 
	 }
		
		@GetMapping("/viewfunction")
		public List<ENTITY_Function> get( ) {
			return service_Function.getAll();
		}

}
