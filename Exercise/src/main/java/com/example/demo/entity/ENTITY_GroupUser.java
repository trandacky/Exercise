package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="groupusertable")
public class ENTITY_GroupUser {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupuser_id;
	
	@ManyToOne 
    @JoinColumn(name = "group_id")
    private ENTITY_Group Group_idxx;
	
	@ManyToOne 
    @JoinColumn(name = "user_id")
    private ENTITY_User User_idxx;

	public Long getGroupuser_id() {
		return groupuser_id;
	}

	public void setGroupuser_id(Long groupuser_id) {
		this.groupuser_id = groupuser_id;
	}

	public ENTITY_Group getGroup_idxx() {
		return Group_idxx;
	}

	public void setGroup_idxx(ENTITY_Group group_idxx) {
		Group_idxx = group_idxx;
	}

	public ENTITY_User getUser_idxx() {
		return User_idxx;
	}

	public void setUser_idxx(ENTITY_User user_idxx) {
		User_idxx = user_idxx;
	}

}
