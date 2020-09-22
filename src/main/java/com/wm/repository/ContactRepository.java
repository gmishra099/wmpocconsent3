package com.wm.repository;

import com.wm.model.Contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
	Contact findBycusId(String cusId);
}
