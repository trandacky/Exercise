package com.example.demo.service.implement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.ENTITY_Account_Policy;
import com.example.demo.repository.REPOSITORY_AccountPolicy;
import com.example.demo.service.SERVICE_AccountPolicy;
@Service
public class IMPLEMENT_Service_AccountPolicy implements SERVICE_AccountPolicy{

	private final REPOSITORY_AccountPolicy repository_AccountPolicy;
	public IMPLEMENT_Service_AccountPolicy(REPOSITORY_AccountPolicy repository_AccountPolicy) {
		super();
		this.repository_AccountPolicy=repository_AccountPolicy;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<ENTITY_Account_Policy> getAll() {
		
		return repository_AccountPolicy.findAll();
	}

	
	public ENTITY_Account_Policy setData(/* @Valid @RequestBody ENTITY_Account_Policy entity_Accountpolicy */) {
		ENTITY_Account_Policy accountpolicy = new ENTITY_Account_Policy();
		accountpolicy.setName("tên thứ 3");

		String dateString = "23/04/2005";

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		try {
			date = df.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		accountpolicy.setCreateDay(date);
		return repository_AccountPolicy.save(accountpolicy);
	}

	public Optional<ENTITY_Account_Policy> update(@PathVariable Long id) {

		return repository_AccountPolicy.findById(id).map(accountpolicy -> {
			accountpolicy.setName("tên update");
			String dateString = "23/04/2005";

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			try {
				date = df.parse(dateString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			accountpolicy.setCreateDay(date);
			return repository_AccountPolicy.save(accountpolicy);
		});
	}

	public Optional<Object> delete(@PathVariable Long id) {
		return repository_AccountPolicy.findById(id).map(accountpolicy -> {
			repository_AccountPolicy.delete(accountpolicy);
			return ResponseEntity.ok().build();
		});
	}
		
	                                          
		
	
	
	
}
