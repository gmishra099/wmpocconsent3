package com.wm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.model.Individual;
import com.wm.repository.IndividualRepository;

@Service
public class IndividualServiceImpl implements IndividualService  {
	
	@Autowired
    private IndividualRepository individualRepository;
	
	@Override
    public List<Individual> getAllIndividuals() {
        return individualRepository.findAll();
    }
	
	@Override
    public Individual findByindSFID(String sfid) {
        return individualRepository.findByindSFID(sfid);
    }

}
