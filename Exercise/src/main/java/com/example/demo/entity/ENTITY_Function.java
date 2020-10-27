package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="functiontable")
public class ENTITY_Function {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long function_id;

	@Column(name = "name")
	private String Name;
	@Column(name = "description")
	private String description;

	@Column(name = "createday")
	private Date createDay;
	
	
	  @OneToMany(mappedBy = "Function_idxx") private List<ENTITY_RoleFunction>
	  roleFunction;
	 

	public Long getFunction_id() {
		return function_id;
	}

	public void setFunction_id(Long function_id) {
		this.function_id = function_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateDay() {
		return createDay;
	}

	public void setCreateDay(Date createDay) {
		this.createDay = createDay;
	}

	/*
	 * public List<ENTITY_RoleFunction> getRoleFunction() { return roleFunction; }
	 */
	
	  public void setRoleFunction(List<ENTITY_RoleFunction> roleFunction) {
	  this.roleFunction = roleFunction; }
	 
	
}
