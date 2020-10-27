package com.example.demo.controler;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ENTITY_Account_Policy;
import com.example.demo.service.SERVICE_AccountPolicy;

@RestController
public class CONTROLER_AccountPolicy {
	private final SERVICE_AccountPolicy service_AccountPolicy;

	public CONTROLER_AccountPolicy(SERVICE_AccountPolicy service_AccountPolicy) {
		super();
		this.service_AccountPolicy = service_AccountPolicy;

	}

	@GetMapping("/view/accountpolicy")
	public List<ENTITY_Account_Policy> get() {
		return service_AccountPolicy.getAll();
	}

	@PostMapping("/set/accountpolicy")
	public ENTITY_Account_Policy set() {
		

		return service_AccountPolicy.setData();
	}
	 @PutMapping("/update/accountpolicy/{id}")
	 public Optional<ENTITY_Account_Policy> update(@PathVariable Long id)
	 {
		 
		 return service_AccountPolicy.update(id);
	 }
	 @DeleteMapping("/delete/accountpolicy/{id}")
	 public Optional<Object> delete(@PathVariable Long id)
	 {
		 
		 return service_AccountPolicy.delete(id);
	 }

}
