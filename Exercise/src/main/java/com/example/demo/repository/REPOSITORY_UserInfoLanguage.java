package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ENTITY_UserInfoLanguage;
@Repository
public interface REPOSITORY_UserInfoLanguage extends JpaRepository<ENTITY_UserInfoLanguage, Long>{

}
