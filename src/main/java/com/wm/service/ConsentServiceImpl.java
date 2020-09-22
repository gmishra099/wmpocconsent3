package com.wm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.model.Consent;
import com.wm.repository.ConsentRepository;
import com.wm.repository.ContactRepository;

@Service
public class ConsentServiceImpl implements  ConsentService {
	@Autowired
    private ConsentRepository consentRepository;

	@Override
	public List<Consent> findByconsentGiverId(String consentGiverId) {
		// TODO Auto-generated method stub
		return consentRepository.findByconsentGiverId(consentGiverId);
	}

}
