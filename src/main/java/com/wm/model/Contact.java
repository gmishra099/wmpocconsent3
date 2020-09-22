package com.wm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact", schema="salesforce")
public class Contact {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "Name")
    private String name;
    
    @Column(name = "sfid")
    private String conSFDC;

    
    @Column(name = "Customer_Id__c")
    private String cusId;
    
    @Column(name = "Individualid")
    private String  Individualid;
    

	public String getIndividualid() {
		return Individualid;
	}


	public void setIndividualid(String individualid) {
		Individualid = individualid;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getConSFDC() {
		return conSFDC;
	}


	public void setConSFDC(String conSFDC) {
		this.conSFDC = conSFDC;
	}


	public String getCusId() {
		return cusId;
	}


	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

   
}
