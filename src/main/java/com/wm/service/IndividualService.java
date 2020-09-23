package com.wm.service;

import java.util.List;

import com.wm.model.Contact;
import com.wm.model.Individual;

public interface IndividualService {
	
  //  Contact createContact(Contact person);

    public List<Individual> getAllIndividuals();
    public Individual findByindSFID(String sfid);
    public Individual save(Individual ind);

  //  long countContacts();

}
