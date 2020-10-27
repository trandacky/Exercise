package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.ENTITY_UserRole;
@Repository
public interface REPOSITORY_UserRole extends JpaRepository<ENTITY_UserRole, Long>{

}
