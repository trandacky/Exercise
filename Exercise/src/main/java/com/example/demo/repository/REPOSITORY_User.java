package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ENTITY_User;

@Repository
public interface REPOSITORY_User extends JpaRepository<ENTITY_User, Long>{
	

}
