package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ENTITY_Function;

@Repository
public interface REPOSITORY_Function extends JpaRepository<ENTITY_Function, Long>{

}
