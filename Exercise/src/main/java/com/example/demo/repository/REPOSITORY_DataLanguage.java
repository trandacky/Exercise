package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ENTITY_DataLanguage;
@Repository
public interface REPOSITORY_DataLanguage extends JpaRepository<ENTITY_DataLanguage, Long> {

}
