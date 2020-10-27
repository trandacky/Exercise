package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.ENTITY_RoleFunction;
@Repository
public interface REPOSITORY_RoleFunction extends JpaRepository<ENTITY_RoleFunction, Long>{

}
