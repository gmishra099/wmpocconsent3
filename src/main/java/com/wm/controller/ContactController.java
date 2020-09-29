package com.wm.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.wm.model.Consent;
import com.wm.model.Contact;
import com.wm.model.ContactPointEmail;
import com.wm.model.ContactPointPhone;
import com.wm.model.Individual;
import com.wm.service.ConsentService;
import com.wm.service.ContactPointEmailService;
import com.wm.service.ContactPointPhoneService;
import com.wm.service.ContactService;
import com.wm.service.IndividualService;
import com.wm.wrapper.WrapperConsent;
import com.wm.wrapper.WrapperIndividual;

@RestController
@RequestMapping({ "/api" })
public class ContactController {
	
	@Autowired
	ContactService contactService;
	@Autowired
	IndividualService individualService;
	
	@Autowired
	ConsentService consentService;
	@Autowired
	ContactPointEmailService contactPointEmailService;
	@Autowired
	ContactPointPhoneService contactPointPhoneService;
	
		@RequestMapping(value = "/test", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
		public String home(Model model) {
			System.out.println("test");
			return "testhome123";
		}
		
		@RequestMapping(value = "/test1", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
		public List<Contact> home1() {
			System.out.println("test");
			contactService.getAllContacts();
			return contactService.getAllContacts();
		}

		
		@RequestMapping(value = "/test5/{custId}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
		public WrapperIndividual home5(@PathVariable String custId) {
			Contact con=contactService.findByCustId(custId);
			String indSFID= con.getIndividualid();
			Individual ind=individualService.findByindSFID(indSFID);
			WrapperIndividual obj = new WrapperIndividual();
			obj.setCusId(con.getCusId());
			obj.setHasoptedouttracking(ind.getHasoptedouttracking());
			obj.setName(ind.getName());
			obj.setShouldforget(ind.getShouldforget());
			String indSfid = ind.getIndSFID();
			List<Consent> consents=consentService.findByconsentGiverId(indSfid);
			List<WrapperConsent> wrapperConsentList = new ArrayList<WrapperConsent>();
			for(Consent consent: consents) {
				WrapperConsent wrapperConsentObj = new WrapperConsent();
				String coontactPointId = consent.getContactPointId();
				
				
				if(contactPointEmailService.findBycontactPointEmailsfid(coontactPointId) != null) {
					ContactPointEmail conPoinEmailObj=contactPointEmailService.findBycontactPointEmailsfid(coontactPointId);
					wrapperConsentObj.setContactPoint(conPoinEmailObj.getEmailAddress());
				}
				else {
					ContactPointPhone conPoinPhoneObj=contactPointPhoneService.findBycontactPointPhonesfid(coontactPointId);
					wrapperConsentObj.setContactPoint(conPoinPhoneObj.getTelephoneNumber());
				}
				
				wrapperConsentObj.setConsentState(consent.getConsent__c());;
				wrapperConsentObj.setConsentName(consent.getName());
				wrapperConsentObj.setCommSubscriptionFormula(consent.getComm_sub__c());
				wrapperConsentObj.setCommSubscriptionChannelType(consent.getCommSubscriptionChannelTypeId());
				wrapperConsentList.add(wrapperConsentObj);
			}
			obj.setWrapperConsentList(wrapperConsentList);
			return obj;
		}


	
		@PutMapping("/test/{id}")
		public Consent updateEmployee(@PathVariable(value = "id") String custId,
				@Validated @RequestBody WrapperIndividual indDetail){
			Contact con=contactService.findByCustId(custId);
			String indSFID= con.getIndividualid();
			Individual ind=individualService.findByindSFID(indSFID);
			ind.setName(indDetail.getName());
			ind.setHasoptedouttracking(indDetail.getHasoptedouttracking());
			ind.setShouldforget(indDetail.getShouldforget());
			individualService.save(ind);
			
			List<WrapperConsent> WrapperConsentList=indDetail.getWrapperConsentList();
			for(WrapperConsent WrapperConsent:WrapperConsentList) {
				System.out.println(WrapperConsent.getCommSubscriptionFormula()+"  "+WrapperConsent.getContactPoint()+"  "+WrapperConsent.getConsentState());
				
			}
			
			Consent con1 =consentService.findByComm_sub__cAndcontactpointid("News Updates", "0Ow2w000000XZAMCA4");
	        con1.setConsent__c("Opt-Out");
			System.out.println("consent test value"+con1.getConsent__c());
			consentService.save(con1);
			Consent con2 =consentService.findByComm_sub__cAndcontactpointid("News Updates", "0Ow2w000000XZAMCA4");
			System.out.println("consent test value"+con2.getConsentSFDC());
			//}
			return con1;
		}
	
	
}
