package com.example.demo.controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.ENTITY_Function;
import com.example.demo.entity.ENTITY_Role;
import com.example.demo.entity.ENTITY_RoleFunction;
import com.example.demo.service.SERVICE_RoleFunction;

@RestController
public class CONTROLER_RoleFunction {
	private final SERVICE_RoleFunction service_RoleFunction;

	public CONTROLER_RoleFunction(SERVICE_RoleFunction service_RoleFunction) {
		super();
		this.service_RoleFunction = service_RoleFunction;

	}

	@GetMapping("/view/rolefunction")
	public List<ENTITY_RoleFunction> get() {
		return service_RoleFunction.getAll();
	}

	@PostMapping("/set/rolefunction")
	public ENTITY_RoleFunction set() {
		ENTITY_RoleFunction roleFunction = new ENTITY_RoleFunction();

		ENTITY_Role role_idx = new ENTITY_Role();
		ENTITY_Function funton_idxx = new ENTITY_Function();

		funton_idxx.setFunction_id((long) 0);
		role_idx.setRole_id((long) 2);

		roleFunction.setFunction_idxx(funton_idxx);
		roleFunction.setRole_idx(role_idx);

		return service_RoleFunction.setData(roleFunction);
	}
}
