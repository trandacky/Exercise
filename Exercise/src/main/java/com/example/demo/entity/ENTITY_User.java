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
@Table(name="usertable")

public class ENTITY_User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;


    @ManyToOne 
    @JoinColumn(name = "domain_id")
    private ENTITY_Domain Domain_idxx;
    
    
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String passWord;
    
    @Column(name = "enable")
    private boolean enable;
    
    @Column(name = "clocked")
    private boolean clocked;
    @Column(name = "can_change_password")
    private boolean canchange;
    @Column(name = "must_change_password")
    private boolean mustchange;
    
    @Column(name = "createday")
    private Date createDay;
    @OneToMany(mappedBy = "User_idxx")
	 private List<ENTITY_GroupUser> user;
	 
	 @OneToMany(mappedBy = "User_idxx")
	 private List<ENTITY_UserRole> userRole;
	 
	 @OneToMany(mappedBy = "User_idxx")
	 private List<ENTITY_UserInfo> userinfo;
    
    
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public boolean isClocked() {
		return clocked;
	}

	public void setClocked(boolean clocked) {
		this.clocked = clocked;
	}

	public boolean isCanchange() {
		return canchange;
	}

	public void setCanchange(boolean canchange) {
		this.canchange = canchange;
	}

	public boolean isMustchange() {
		return mustchange;
	}

	public void setMustchange(boolean mustchange) {
		this.mustchange = mustchange;
	}

	public Date isCreateDay() {
		return createDay;
	}

	public void setCreateDay(Date createDay) {
		this.createDay = createDay;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	/*
	 * public ENTITY_Domain getDomain_id() { return Domain_idxx; }
	 */

	public void setDomain_id(ENTITY_Domain domain_id) {
		this.Domain_idxx = domain_id;
	}

	public ENTITY_Domain getDomain_idxx() {
		return Domain_idxx;
	}

	public void setDomain_idxx(ENTITY_Domain domain_idxx) {
		Domain_idxx = domain_idxx;
	}

	

	/*
	 * public List<ENTITY_GroupUser> getUser() { return user; }
	 */

	public void setUser(List<ENTITY_GroupUser> user) {
		this.user = user;
	}

	public Date getCreateDay() {
		return createDay;
	}

	/*
	 * public List<ENTITY_UserRole> getUserRole() { return userRole; }
	 */
	public void setUserRole(List<ENTITY_UserRole> userRole) {
		this.userRole = userRole;
	}
	/*
	 * public List<ENTITY_UserInfo> getUserinfo() { return userinfo; }
	 */

	public void setUserinfo(List<ENTITY_UserInfo> userinfo) {
		this.userinfo = userinfo;
	}

	
    
    
}
