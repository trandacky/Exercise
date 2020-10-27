package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="userroletable")
public class ENTITY_UserRole {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userrole_id;
	
	@ManyToOne 
    @JoinColumn(name = "user_id")
    private ENTITY_User User_idxx;
	
	@ManyToOne 
    @JoinColumn(name = "role_id")
    private ENTITY_Role Role_idxx;

	public Long getUserrole_id() {
		return userrole_id;
	}

	public void setUserrole_id(Long userrole_id) {
		this.userrole_id = userrole_id;
	}

	public ENTITY_User getUser_idxx() {
		return User_idxx;
	}

	public void setUser_idxx(ENTITY_User user_idxx) {
		User_idxx = user_idxx;
	}

	public ENTITY_Role getRole_idxx() {
		return Role_idxx;
	}

	public void setRole_idxx(ENTITY_Role role_idxx) {
		Role_idxx = role_idxx;
	}


}
