package com.wm.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.model.Contact;
import com.wm.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact createContact(Contact person) {
        return contactRepository.save(person);
    }


    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
    
   

    @Override
    public long countContacts() {
        return contactRepository.count();
    }
    
    @Override
    public Optional<Contact> getContactById(Long id){
        return contactRepository.findById(id);
        
       
    }
    
    @Override
    public Contact findByCustId(String custID){
        return contactRepository.findBycusId(custID);
        
       
    }
    
    
    
}
