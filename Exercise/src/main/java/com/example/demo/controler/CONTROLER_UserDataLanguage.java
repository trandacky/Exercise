package com.example.demo.controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.ENTITY_UserDataLanguage;
import com.example.demo.service.SERVICE_UserDataLanguage;
@RestController
public class CONTROLER_UserDataLanguage {
	private final SERVICE_UserDataLanguage service_UserDataLanguage;
	 public CONTROLER_UserDataLanguage(SERVICE_UserDataLanguage service_UserDataLanguage)
	 {
		 super();
		 this.service_UserDataLanguage=service_UserDataLanguage;
		 
	 }
		
		@GetMapping("/viewuserdatalanguage")
		public List<ENTITY_UserDataLanguage> get( ) {
			return service_UserDataLanguage.getAll();
		}
}
