package com.wm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CommSubscriptionConsent", schema="salesforce")

public class Consent {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name = "sfid")
    private String conSFDC;
    
    @Column(name = "ContactPointId")
    private String contactPoint;
    
    @Column(name = "Consent__c")
    private String consentState;
    
    @Column(name = "Name")
    private String consentName;
    
    @Column(name = "ConsentCapturedSource")
    private String consentCapturedSource;
    
    @Column(name = "Comm_Sub__c")
    private String commSubscription;
    
    @Column(name = "ConsentGiverId")
    private String consentGiverId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConSFDC() {
		return conSFDC;
	}

	public void setConSFDC(String conSFDC) {
		this.conSFDC = conSFDC;
	}

	public String getContactPoint() {
		return contactPoint;
	}

	public void setContactPoint(String contactPoint) {
		this.contactPoint = contactPoint;
	}

	public String getConsentState() {
		return consentState;
	}

	public void setConsentState(String consentState) {
		this.consentState = consentState;
	}

	public String getConsentName() {
		return consentName;
	}

	public void setConsentName(String consentName) {
		this.consentName = consentName;
	}

	public String getConsentCapturedSource() {
		return consentCapturedSource;
	}

	public void setConsentCapturedSource(String consentCapturedSource) {
		this.consentCapturedSource = consentCapturedSource;
	}

	public String getCommSubscription() {
		return commSubscription;
	}

	public void setCommSubscription(String commSubscription) {
		this.commSubscription = commSubscription;
	}

	public String getConsentGiverId() {
		return consentGiverId;
	}

	public void setConsentGiverId(String consentGiverId) {
		this.consentGiverId = consentGiverId;
	}

    
    
}
