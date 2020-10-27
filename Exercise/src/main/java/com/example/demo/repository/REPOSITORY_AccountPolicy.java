package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ENTITY_Account_Policy;
@Repository
public interface REPOSITORY_AccountPolicy extends JpaRepository<ENTITY_Account_Policy, Long>{
	

}
