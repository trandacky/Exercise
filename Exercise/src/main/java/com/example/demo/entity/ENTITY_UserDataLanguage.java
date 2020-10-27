package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="userdatalanguagetable")
public class ENTITY_UserDataLanguage {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@ManyToOne 
    @JoinColumn(name = "userinfo_id")
    private ENTITY_UserInfo UserInfo_idxx;
	
	@ManyToOne 
    @JoinColumn(name = "datalanguage_id")
    private ENTITY_DataLanguage DataLanguage_idxx;
	@Column(name = "description")
	private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ENTITY_UserInfo getUserInfo_idxx() {
		return UserInfo_idxx;
	}
	public void setUserInfo_idxx(ENTITY_UserInfo userInfo_idxx) {
		UserInfo_idxx = userInfo_idxx;
	}
	public ENTITY_DataLanguage getDataLanguage_idxx() {
		return DataLanguage_idxx;
	}
	public void setDataLanguage_idxx(ENTITY_DataLanguage dataLanguage_idxx) {
		DataLanguage_idxx = dataLanguage_idxx;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
