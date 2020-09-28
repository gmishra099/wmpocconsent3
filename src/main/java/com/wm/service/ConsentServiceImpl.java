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
	
		@Override
	public Consent findByComm_sub__cAndcontactpointid(String getComm_sub__c, String getContactPointId) {
		// TODO Auto-generated method stub
		return consentRepository.findByComm_sub__cAndcontactpointid(getComm_sub__c,getContactPointId);
	}

		@Override
	public Consent save(Consent con) {
		// TODO Auto-generated method stub
		return consentRepository.save(con);
	}
}
