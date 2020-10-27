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
@Table(name="domaintable")
public class ENTITY_Domain {
	@Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long domain_id;
 
    @Column(name = "name")
    private String name;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "createday")
    private Date createday;
    // trỏ qua biến Domain_idxx bên class kia
	
	  @OneToMany(mappedBy = "Domain_idxx") private List<ENTITY_User> user;
	  
	  @OneToMany(mappedBy = "Domain_idxx") private List<ENTITY_Group> group;
	 
    
    
	public Date getCreateday() {
		return createday;
	}

	public void setCreateday(Date createday) {
		this.createday = createday;
	}
	/*
	 * public List<User> getUser() { return user; }
	 */

	
	  public void setUser(List<ENTITY_User> user) { this.user = user; }
	 

	public Long getDomain_id() {
		return domain_id;
	}

	public void setDomain_id(Long domain_id) {
		this.domain_id = domain_id;
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

	/*
	 * public List<ENTITY_Group> getGroup() { return group; }
	 */

	
	  public void setGroup(List<ENTITY_Group> group) { this.group = group; }
	 



 
    
}
