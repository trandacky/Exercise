package com.example.demo.controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.ENTITY_UserInfoLanguage;
import com.example.demo.service.SERVICE_UserInfoLanguage;
@RestController
public class CONTROLER_UserInfoLanguage {
	private final SERVICE_UserInfoLanguage service_UserInfoLanguage;
	 public CONTROLER_UserInfoLanguage(SERVICE_UserInfoLanguage service_UserInfoLanguage)
	 {
		 super();
		 this.service_UserInfoLanguage=service_UserInfoLanguage;
		 
	 }
		
		@GetMapping("/viewuserinfolanguage")
		public List<ENTITY_UserInfoLanguage> get( ) {
			return service_UserInfoLanguage.getAll();
		}
}
