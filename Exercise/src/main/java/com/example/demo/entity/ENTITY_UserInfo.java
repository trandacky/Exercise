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
@Table(name="userinfotable")
public class ENTITY_UserInfo {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userinfo_id;


    @ManyToOne 
    @JoinColumn(name = "user_id")
    private ENTITY_User User_idxx;
    
    
    @Column(name = "fullname")
    private String fullName;
    
    @Column(name = "firstname")
    private String firstName;
    
    @Column(name = "lastname")
    private String lastName;
    
    @Column(name = "initials")
    private String initials;
    
    @Column(name = "comment")
    private String comment;
    
    @Column(name = "mobile")
    private String mobile;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "email1")
    private String email1;
    
    @Column(name = "email2")
    private String email2;
    
    @Column(name = "email3")
    private String email3;
       
    @Column(name = "createday")
    private Date createDay;

    
    
    @OneToMany(mappedBy = "UserInfo_idxx")
   	private List<ENTITY_UserDataLanguage> userDataLanguage;
    
    
    
	public Long getUserinfo_id() {
		return userinfo_id;
	}

	public void setUserinfo_id(Long userinfo_id) {
		this.userinfo_id = userinfo_id;
	}

	public ENTITY_User getUser_idxx() {
		return User_idxx;
	}

	public void setUser_idxx(ENTITY_User user_idxx) {
		this.User_idxx = user_idxx;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getEmail3() {
		return email3;
	}

	public void setEmail3(String email3) {
		this.email3 = email3;
	}

	public Date getCreateDay() {
		return createDay;
	}

	public void setCreateDay(Date createDay) {
		this.createDay = createDay;
	}
	/*
		 * 
		 * public List<ENTITY_UserDataLanguage> getUserDataLanguage() { return
		 * userDataLanguage; }
		 */
	public void setUserDataLanguage(List<ENTITY_UserDataLanguage> userDataLanguage) {
		this.userDataLanguage = userDataLanguage;
	}
    
	
	
    
}
