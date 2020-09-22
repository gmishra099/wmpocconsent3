package com.wm.service;

import com.wm.model.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {

    Contact createContact(Contact person);

    public List<Contact> getAllContacts();

    long countContacts();
    public Optional<Contact> getContactById(Long Id);
    public Contact findByCustId(String custID);

    
}
