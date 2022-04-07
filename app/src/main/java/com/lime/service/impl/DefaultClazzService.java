package com.lime.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lime.dao.ClazzDao;
import com.lime.domain.Clazz;
import com.lime.domain.Market;
import com.lime.service.ClazzService;

@Service
public class DefaultClazzService implements ClazzService{

	@Autowired
	ClazzDao clazzDao;
	
	@Transactional
	  public List<Clazz> clazzList() {
	    return clazzDao.findAll();
	  }
	  @Override
	  @Transactional
	  public int add(Clazz clazz) {
	    return clazzDao.insert(clazz);
	  }
	  @Override
	  public List<Clazz> regionList(String regionName) {
	    return clazzDao.findByRegion(regionName);
	  }
	@Override
	public List<Clazz> cityList(String regionName, String cityName) {
		return clazzDao.findByCity(regionName, cityName);	
		}

}
