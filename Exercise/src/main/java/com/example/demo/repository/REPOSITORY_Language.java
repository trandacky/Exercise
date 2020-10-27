package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ENTITY_Language;
@Repository
public interface REPOSITORY_Language extends JpaRepository<ENTITY_Language, Long>{

}
