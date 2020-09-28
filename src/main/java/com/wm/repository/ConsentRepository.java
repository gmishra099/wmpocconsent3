package com.wm.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wm.model.Consent;
@Repository
public interface ConsentRepository extends JpaRepository<Consent, Long> {
	List<Consent> findByconsentGiverId(String consentGiverId);
	@Query( value = "SELECT * FROM commsubscriptionconsent u WHERE Comm_sub__c = ?1 AND contactpointid =?2",nativeQuery = true)
	Consent findByComm_sub__cAndcontactpointid(String getComm_sub__c, String getContactPointId);
}
