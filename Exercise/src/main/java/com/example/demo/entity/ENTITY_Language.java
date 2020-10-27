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
@Table(name = "languagetable")
public class ENTITY_Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long language_id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "createday")
	private Date createday;

	@OneToMany(mappedBy = "Language_idxx") 
	private List<ENTITY_UserInfoLanguage> Language_idx;
	 
    
	public Long getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(Long language_id) {
		this.language_id = language_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateday() {
		return createday;
	}

	public void setCreateday(Date createday) {
		this.createday = createday;
	}

	/*
	 * public List<ENTITY_UserInfoLanguage> getLanguage_idx() { return Language_idx;
	 * }
	 */
	public void setLanguage_idx(List<ENTITY_UserInfoLanguage> language_idx) {
		Language_idx = language_idx;
	}
	
	
	
	

}
