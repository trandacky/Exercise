package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "grouptable")
public class ENTITY_Group {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long group_id;

	@ManyToOne
	@JoinColumn(name = "domain_id")
	private ENTITY_Domain Domain_idxx;

	@Column(name = "name")
	private String Name;
	@Column(name = "description")
	private String description;

	@Column(name = "createday")
	private Date createDay;

	
	  @OneToMany(mappedBy = "Group_idxx") private List<ENTITY_GroupUser> group;
	 
	
	public Long getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Long group_id) {
		this.group_id = group_id;
	}

	public ENTITY_Domain getDomain_idxx() {
		return Domain_idxx;
	}

	public void setDomain_idxx(ENTITY_Domain domain_idxx) {
		Domain_idxx = domain_idxx;
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
	 * public List<ENTITY_GroupUser> getGroup() { return group; }
	 */

	
	  public void setGroup(List<ENTITY_GroupUser> group) { this.group = group; }
	 

	

}
