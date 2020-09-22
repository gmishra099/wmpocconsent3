package com.wm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.model.ContactPointEmail;
import com.wm.repository.ConsentRepository;
import com.wm.repository.ContactPointEmailRepository;

@Service
public class ContactPointEmailImpl implements ContactPointEmailService{

	@Autowired
    private ContactPointEmailRepository contactPointEmailRepository;
	
	@Override
	public ContactPointEmail findBycontactPointEmailsfid(String contactPointId) {
		// TODO Auto-generated method stub
		return contactPointEmailRepository.findBycontactPointEmailsfid(contactPointId);
	}

}
