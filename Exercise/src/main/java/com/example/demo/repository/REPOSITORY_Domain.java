package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ENTITY_Domain;

@Repository
public interface REPOSITORY_Domain extends JpaRepository<ENTITY_Domain, Long>{
	
	@Query(value="SELECT * "
			+"FROM public.domaintable where domain_id=:id",nativeQuery = true)
	Optional<ENTITY_Domain> getByID(@Param("id") Long id)	;
	
}
