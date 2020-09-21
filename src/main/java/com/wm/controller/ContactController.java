package com.wm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wm.model.Contact;
import com.wm.service.ContactService;

@RestController
@RequestMapping({ "/api" })
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
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

	
}
