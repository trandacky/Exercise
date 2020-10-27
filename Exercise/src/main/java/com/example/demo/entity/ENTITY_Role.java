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
@Table(name = "roletable")
public class ENTITY_Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long role_id;

	@Column(name = "name")
	private String Name;
	@Column(name = "description")
	private String description;

	@Column(name = "createday")
	private Date createDay;

	@OneToMany(mappedBy = "Role_idxx")
	private List<ENTITY_UserRole> userRole;
	
	/*
	 * @OneToMany(mappedBy = "Role_idxx") private List<ENTITY_RoleFunction>
	 * roleFunction;
	 */
	public String getName() {
		return Name;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
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
	 * public List<ENTITY_UserRole> getUserRole() { return userRole; }
	 */

	public void setUserRole(List<ENTITY_UserRole> userRole) {
		this.userRole = userRole;
	}
	/*
	 * public List<ENTITY_RoleFunction> getRoleFunction() { return roleFunction; }
	 */

	/*
	 * public void setRoleFunction(List<ENTITY_RoleFunction> roleFunction) {
	 * this.roleFunction = roleFunction; }
	 */
	
	

}
