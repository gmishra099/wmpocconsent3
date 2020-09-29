package com.wm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "individual", schema="salesforce")
public class Individual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "Name")
    private String name;
    
    @Column(name = "Lastname")
    private String lastName;

    
    @Column(name = "sfid")
    private String indSFID;
    
    @Column(name = "Hasoptedouttracking")
    private Boolean Hasoptedouttracking;
    

	@Column(name = "Shouldforget")
    private Boolean Shouldforget;


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


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getIndSFID() {
		return indSFID;
	}


	public void setIndSFID(String indSFID) {
		this.indSFID = indSFID;
	}


	public Boolean getHasoptedouttracking() {
		return Hasoptedouttracking;
	}


	public void setHasoptedouttracking(Boolean hasoptedouttracking) {
		Hasoptedouttracking = hasoptedouttracking;
	}


	public Boolean getShouldforget() {
		return Shouldforget;
	}


	public void setShouldforget(Boolean shouldforget) {
		Shouldforget = shouldforget;
	}

	
    

}
