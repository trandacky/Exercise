package com.example.demo.controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ENTITY_Language;
import com.example.demo.service.SERVICE_Language;

@RestController
public class CONTROLER_Language {

	private final SERVICE_Language service_Language;
	 public CONTROLER_Language(SERVICE_Language service_Language)
	 {
		 super();
		 this.service_Language=service_Language;
		 
	 }
		
		@GetMapping("/viewlanguage")
		public List<ENTITY_Language> get( ) {
			return service_Language.getAll();
		}
}
