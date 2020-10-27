package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ENTITY_Role;
@Repository
public interface REPOSITORY_Role extends JpaRepository<ENTITY_Role, Long>{

}
