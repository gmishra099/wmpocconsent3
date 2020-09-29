package com.wm.service;

import java.util.List;

import com.wm.model.Consent;
import com.wm.model.ContactPointEmail;

public interface ContactPointEmailService {
	public ContactPointEmail findBycontactPointEmailsfid(String contactPointId);
	public ContactPointEmail findByemailAddress(String emailAddress);
}
