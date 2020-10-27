package com.example.demo.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.ENTITY_RoleFunction;

public interface SERVICE_RoleFunction {
	List<ENTITY_RoleFunction> getAll();
	ENTITY_RoleFunction setData(@Valid @RequestBody ENTITY_RoleFunction roleFunction);
}
