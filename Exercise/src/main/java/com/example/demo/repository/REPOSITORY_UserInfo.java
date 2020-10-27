package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ENTITY_UserInfo;
@Repository

public interface REPOSITORY_UserInfo extends JpaRepository<ENTITY_UserInfo, Long>{

}
