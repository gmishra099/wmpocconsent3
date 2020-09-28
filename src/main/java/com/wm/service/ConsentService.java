package com.wm.service;

import java.util.List;

import com.wm.model.Consent;
import com.wm.model.Contact;

public interface ConsentService {
	public List<Consent> findByconsentGiverId(String consentGiverId);
	public Consent findByComm_sub__cAndcontactpointid(String getComm_sub__c, String coontactPointId);
}
