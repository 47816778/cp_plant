package com.mywork.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mywork.dao.CpbMapper;
import com.mywork.domain.Cpb;
import com.mywork.domain.CpbExample;
import com.mywork.domain.CpbExample.Criteria;
import com.mywork.service.InitCpPlantService;
import com.mywork.util.NumUtils;

@Service
public class InitCpPlantServiceImpl implements InitCpPlantService {
	Logger log = LoggerFactory.getLogger(InitCpPlantServiceImpl.class);
	
	@Resource
	private CpbMapper cpbMapper;
	
	@PostConstruct
	public void init(){
		log.info("------------ init start ------------------");
		initDatebase();
		log.info("------------ init end ------------------");
	}
	
	public void initDatebase() {
		CpbExample example = new CpbExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andQhLike("2008%");
		List<Cpb> list = cpbMapper.selectByExample(example);
		for(Cpb c : list){
			if(c.getGws()!=null && c.getSws() != null && c.getBws() != null && c.getQws() != null && c.getWws()!=null){
				NumUtils.init(c);
				c.setSj(new Date());
				cpbMapper.updateByPrimaryKey(c);
			}
		}
	}
	
}
