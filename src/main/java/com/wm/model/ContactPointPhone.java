package com.wm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Contactpointphone", schema="salesforce")
public class ContactPointPhone {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "sfid")
    private String contactPointPhonesfid;
    
    @Column(name = "Telephonenumber")
	private String  telephoneNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContactPointPhonesfid() {
		return contactPointPhonesfid;
	}

	public void setContactPointPhonesfid(String contactPointPhonesfid) {
		this.contactPointPhonesfid = contactPointPhonesfid;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
    
	
	
	

}
