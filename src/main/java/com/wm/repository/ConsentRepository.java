package com.wm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wm.model.Consent;
import com.wm.model.Contact;



@Repository
public interface ConsentRepository extends JpaRepository<Consent, Long> {
	List<Consent> findByconsentGiverId(String consentGiverId);
}
