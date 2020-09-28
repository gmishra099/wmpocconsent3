package com.wm.wrapper;

import java.util.List;

public class WrapperIndividual {
	private String cusId;
	private String name;
	private Boolean Hasoptedouttracking;
	private Boolean Shouldforget;
	
	List<WrapperConsent> WrapperConsentList;

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<WrapperConsent> getWrapperConsentList() {
		return WrapperConsentList;
	}

	public void setWrapperConsentList(List<WrapperConsent> wrapperConsentList) {
		WrapperConsentList = wrapperConsentList;
	}
	

	
}
