package com.wm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wm.model.ContactPointEmail;
import com.wm.model.ContactPointPhone;

@Repository
public interface ContactPointPhoneRepository extends JpaRepository<ContactPointPhone, Long> {
	ContactPointPhone findBysfid(String contactPointId);
}
