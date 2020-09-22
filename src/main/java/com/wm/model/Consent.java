package com.wm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commsubscriptionconsent", schema="salesforce")

public class Consent {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name = "sfid")
    private String consentSFDC;
    
  
    @Column(name = "consentgiverid")
    private String consentGiverId;
    
    @Column(name = "Consent__c")
    private String Consent__c;
    
    @Column(name = "Name")
    private String name;
    
    @Column(name = "contactpointid")
    private String contactPointId;
    
    @Column(name = "Comm_sub__c")
    private String comm_sub__c;
    
    @Column(name = "Commsubscriptionchanneltypeid")
    private String commSubscriptionChannelTypeId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConsentSFDC() {
		return consentSFDC;
	}

	public void setConsentSFDC(String consentSFDC) {
		this.consentSFDC = consentSFDC;
	}

	public String getConsentGiverId() {
		return consentGiverId;
	}

	public void setConsentGiverId(String consentGiverId) {
		this.consentGiverId = consentGiverId;
	}

	public String getConsent__c() {
		return Consent__c;
	}

	public void setConsent__c(String consent__c) {
		Consent__c = consent__c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactPointId() {
		return contactPointId;
	}

	public void setContactPointId(String contactPointId) {
		this.contactPointId = contactPointId;
	}

	public String getComm_sub__c() {
		return comm_sub__c;
	}

	public void setComm_sub__c(String comm_sub__c) {
		this.comm_sub__c = comm_sub__c;
	}

	public String getCommSubscriptionChannelTypeId() {
		return commSubscriptionChannelTypeId;
	}

	public void setCommSubscriptionChannelTypeId(String commSubscriptionChannelTypeId) {
		this.commSubscriptionChannelTypeId = commSubscriptionChannelTypeId;
	}  
    
}
