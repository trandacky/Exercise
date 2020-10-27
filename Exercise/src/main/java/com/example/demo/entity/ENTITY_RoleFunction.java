package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "rolefunctiontable")
public class ENTITY_RoleFunction {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rolefunction_id;
	
	@ManyToOne 
    @JoinColumn(name = "role_id")
    private ENTITY_Role Role_idx;
	
	@ManyToOne 
    @JoinColumn(name = "function_id")
    private ENTITY_Function Function_idxx;

	public Long getRolefunction_id() {
		return rolefunction_id;
	}

	public void setRolefunction_id(Long rolefunction_id) {
		this.rolefunction_id = rolefunction_id;
	}

	public ENTITY_Role getRole_idx() {
		return Role_idx;
	}

	public void setRole_idx(ENTITY_Role role_idx) {
		Role_idx = role_idx;
	}

	public ENTITY_Function getFunction_idxx() {
		return Function_idxx;
	}

	public void setFunction_idxx(ENTITY_Function function_idxx) {
		Function_idxx = function_idxx;
	}
	
	
	
}
