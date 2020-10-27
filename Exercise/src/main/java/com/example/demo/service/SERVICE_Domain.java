package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.entity.ENTITY_Domain;
import com.example.demo.service.dto.DTO_Domain;

public interface SERVICE_Domain {
	List<ENTITY_Domain> getAll();
	DTO_Domain getByID(long id);
	ENTITY_Domain setData(/*@Valid @RequestBody ENTITY_Account_Policy accountpolicy*/);
	Optional<ENTITY_Domain> update(@PathVariable Long id);
	Optional<Object> delete(@PathVariable Long id);
}
