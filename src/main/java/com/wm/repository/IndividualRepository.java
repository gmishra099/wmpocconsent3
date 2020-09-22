package com.wm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wm.model.Contact;
import com.wm.model.Individual;

@Repository
public interface IndividualRepository extends JpaRepository<Individual, Long> {
	Individual findByindSFID(String sfid);
}
