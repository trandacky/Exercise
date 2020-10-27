package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.ENTITY_Account_Policy;


public interface SERVICE_AccountPolicy {
	List<ENTITY_Account_Policy> getAll();
	ENTITY_Account_Policy setData(/*@Valid @RequestBody ENTITY_Account_Policy accountpolicy*/);
	Optional<ENTITY_Account_Policy> update(@PathVariable Long id);
	Optional<Object> delete(@PathVariable Long id);
}
