package com.wm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.model.ContactPointPhone;
import com.wm.repository.ContactPointPhoneRepository;

@Service
public class ContactPointPhoneImpl implements ContactPointPhoneService {
	
	@Autowired
    private ContactPointPhoneRepository contactPointPhoneRepository;

	@Override
	public ContactPointPhone findBysfid(String contactPointId) {
		// TODO Auto-generated method stub
		return contactPointPhoneRepository.findBysfid(contactPointId);
	}

}
