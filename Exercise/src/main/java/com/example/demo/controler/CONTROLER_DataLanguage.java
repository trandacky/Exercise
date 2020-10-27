package com.example.demo.controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ENTITY_DataLanguage;
import com.example.demo.service.SERVICE_DataLanguage;
@RestController
public class CONTROLER_DataLanguage {
	private final SERVICE_DataLanguage service_DataLanguage;
	 public CONTROLER_DataLanguage(SERVICE_DataLanguage service_DataLanguage)
	 {
		 super();
		 this.service_DataLanguage=service_DataLanguage;
		 
	 }
		
		@GetMapping("/viewdatalanguage")
		public List<ENTITY_DataLanguage> get( ) {
			return service_DataLanguage.getAll();
		}
}
