package com.wm.wrapper;

import java.util.List;

public class WrapperIndividual {
	private String cusId;
	private String name;
	private String Hasoptedouttracking;
	private String Shouldforget;
	
	List<WrapperConsent> WrapperConsentList;
	
	
	public List<WrapperConsent> getWrapperConsentList() {
		return WrapperConsentList;
	}
	public void setWrapperConsentList(List<WrapperConsent> wrapperConsentList) {
		WrapperConsentList = wrapperConsentList;
	}
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
	public String getHasoptedouttracking() {
		return Hasoptedouttracking;
	}
	public void setHasoptedouttracking(String hasoptedouttracking) {
		Hasoptedouttracking = hasoptedouttracking;
	}
	public String getShouldforget() {
		return Shouldforget;
	}
	public void setShouldforget(String shouldforget) {
		Shouldforget = shouldforget;
	}
	
}
