package com.example.demo.service.dto;

import java.util.Date;


public class DTO_Domain {
    private Long domain_id;
    private String name;
    
    private String description;
    private Date createday;
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
	public Date getCreateday() {
		return createday;
	}
	public void setCreateday(Date createday) {
		this.createday = createday;
	}
    
    
    
}
