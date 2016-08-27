package com.mywork.service.impl;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mywork.service.InitCpPlantService;

@Service
public class InitCpPlantServiceImpl implements InitCpPlantService {
	Logger log = LoggerFactory.getLogger(InitCpPlantServiceImpl.class);
	
	@PostConstruct
	public void init(){
		initDatebase();
	}
	
	public void initDatebase() {
		
	}
	
}
