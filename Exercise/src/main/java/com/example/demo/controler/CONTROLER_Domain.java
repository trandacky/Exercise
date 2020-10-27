package com.example.demo.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ENTITY_Domain;
import com.example.demo.service.SERVICE_Domain;
import com.example.demo.service.dto.DTO_Domain;
@RestController
public class CONTROLER_Domain {
	private final SERVICE_Domain service_Domain;
	 public CONTROLER_Domain(SERVICE_Domain service_Domain)
	 {
		 super();
		 this.service_Domain=service_Domain;
		 
	 }
		
		@GetMapping("/view/domain")
		public List<ENTITY_Domain> get( ) {
			return service_Domain.getAll();
		}
		@GetMapping("/viewdomain/{id}")
		public DTO_Domain getDTO_Domain(@PathVariable("id") Long id ) {
			return service_Domain.getByID(id);
		}
		
		@PostMapping("/set/domain")
		public ENTITY_Domain set() {
			

			return service_Domain.setData();
		}
		 @PutMapping("/update/domain/{id}")
		 public Optional<ENTITY_Domain> update(@PathVariable Long id)
		 {
			 
			 return service_Domain.update(id);
		 }
		 @DeleteMapping("/delete/domain/{id}")
		 public Optional<Object> delete(@PathVariable Long id)
		 {
			 
			 return service_Domain.delete(id);
		 }
}
