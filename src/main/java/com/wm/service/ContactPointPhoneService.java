package com.wm.service;

import com.wm.model.ContactPointPhone;

public interface ContactPointPhoneService {
	public ContactPointPhone findBycontactPointPhonesfid(String contactPointId);
	public ContactPointPhone findBytelephoneNumber(String telephoneNumber);
	public ContactPointPhone save(ContactPointPhone obj);
}
