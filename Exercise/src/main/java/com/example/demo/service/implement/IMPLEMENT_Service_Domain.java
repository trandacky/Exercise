package com.example.demo.service.implement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.ENTITY_Account_Policy;
import com.example.demo.entity.ENTITY_Domain;
import com.example.demo.repository.REPOSITORY_Domain;
import com.example.demo.service.SERVICE_Domain;
import com.example.demo.service.dto.DTO_Domain;
import java.util.Optional;

@Service
public class IMPLEMENT_Service_Domain implements SERVICE_Domain {

	private final REPOSITORY_Domain repository_Domain;

	public IMPLEMENT_Service_Domain(REPOSITORY_Domain repository_dm) {
		super();
		this.repository_Domain = repository_dm;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ENTITY_Domain> getAll() {
		// TODO Auto-generated method stub
		return repository_Domain.findAll();
	}

	@Override
	public DTO_Domain getByID(long id) {

		Optional<ENTITY_Domain> a = repository_Domain.getByID(id);
		DTO_Domain newDTO = new DTO_Domain();
		newDTO.setName(a.get().getName());
		newDTO.setDescription(a.get().getDescription());
		newDTO.setCreateday(a.get().getCreateday());
		newDTO.setDomain_id(id);
		return newDTO;
	}

	public ENTITY_Domain setData(/* @Valid @RequestBody ENTITY_Account_Policy entity_Accountpolicy */) {
		ENTITY_Domain domain = new ENTITY_Domain();
		domain.setDomain_id((long) 1);

		domain.setName("tên test");
		domain.setDescription("một hai ba");
		String dateString = "23/04/2005";

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		try {
			date = df.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		domain.setCreateday(date);
		return repository_Domain.save(domain);
	}

	public Optional<ENTITY_Domain> update(@PathVariable Long id) {

		return repository_Domain.findById(id).map(domain -> {
			domain.setName("tên update");
			String dateString = "23/04/2005";

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			try {
				date = df.parse(dateString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			domain.setCreateday(date);
			return repository_Domain.save(domain);
		});
	}

	public Optional<Object> delete(@PathVariable Long id) {
		return repository_Domain.findById(id).map(domain -> {
			repository_Domain.delete(domain);
			return ResponseEntity.ok().build();
		});
	}

}
