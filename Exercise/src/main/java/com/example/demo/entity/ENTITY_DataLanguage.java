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
@Table(name="datalanguagetable")
public class ENTITY_DataLanguage {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long datalanguage_id;
 
    @Column(name = "name")
    private String name;
    
    @Column(name = "createday")
    private Date createday;
	
	  @OneToMany(mappedBy = "DataLanguage_idxx") private
	  List<ENTITY_UserDataLanguage> userDataLanguage;
	 
	
	

	public Long getDatalanguage_id() {
		return datalanguage_id;
	}

	public void setDatalanguage_id(Long datalanguage_id) {
		this.datalanguage_id = datalanguage_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateday() {
		return createday;
	}

	public void setCreateday(Date createday) {
		this.createday = createday;
	}
	/*
	 * public List<ENTITY_UserDataLanguage> getUserDataLanguage() { return
	 * userDataLanguage; }
	 */

	
	  public void setUserDataLanguage(List<ENTITY_UserDataLanguage>
	  userDataLanguage) { this.userDataLanguage = userDataLanguage; }
	 

	
	
	
}
