package com.wm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wm.model.Consent;
import com.wm.model.ContactPointEmail;

@Repository
public interface ContactPointEmailRepository extends JpaRepository<ContactPointEmail, Long>{
	ContactPointEmail findBycontactPointEmailsfid(String contactPointId);
	ContactPointEmail findByemailAddress(String emailAddress);
}
