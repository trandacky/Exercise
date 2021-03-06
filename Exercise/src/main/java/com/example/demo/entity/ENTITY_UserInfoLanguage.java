package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="userinfolanguagetable")
public class ENTITY_UserInfoLanguage {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@ManyToOne 
    @JoinColumn(name = "userinfo_id")
    private ENTITY_UserInfo UserInfo_idxx;
	
	@ManyToOne 
    @JoinColumn(name = "language_id")
    private ENTITY_Language Language_idxx;

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

	public ENTITY_Language getLanguage_idxx() {
		return Language_idxx;
	}

	public void setLanguage_idxx(ENTITY_Language language_idxx) {
		Language_idxx = language_idxx;
	}
	
}
