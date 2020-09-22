package com.wm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Contactpointemail", schema="salesforce")
public class ContactPointEmail {
	
	@Id
    @GeneratedValue
    private Long id;
    
    @Column(name = "sfid")
    private String contactPointEmailsfid;
    
    @Column(name = "Emailaddress")
	private String emailAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContactPointEmailsfid() {
		return contactPointEmailsfid;
	}

	public void setContactPointEmailsfid(String contactPointEmailsfid) {
		this.contactPointEmailsfid = contactPointEmailsfid;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
