package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accountpolicytable")
public class ENTITY_Account_Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accountpolicy_id;
	@Column(name = "name")
	private String name;
	@Column(name = "createday")
	private Date createDay;
	
	
	
	public long getAccountpolicy_id() {
		return accountpolicy_id;
	}
	public void setAccountpolicy_id(long accountpolicy_id) {
		this.accountpolicy_id = accountpolicy_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateDay() {
		return createDay;
	}
	public void setCreateDay(Date createDay) {
		this.createDay = createDay;
	}

}
