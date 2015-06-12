package com.java.address.service;

import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.java.address.dao.AddressDao;
import com.java.address.dto.AddressDto;

@Component
public class AddressServiceImpl implements AddressService {
	private final Logger logger=Logger.getLogger(this.getClass().getName());
	
	@Autowired
	private AddressDao addressDao;
	
	@Override
	public void write(ModelAndView mav) {
		Map <String, Object> map=mav.getModel();
		AddressDto addressDto=(AddressDto)map.get("addressDto");
		
		int check=addressDao.write(addressDto);		
		logger.info("write check:" + check);
		
		mav.addObject("check" , check);
		mav.setViewName("addr/writeOk");
	}
	
	@Override
	public void selectOk(ModelAndView mav) {
		Map <String, Object> map=mav.getModel();
		String name=(String)map.get("name");
		logger.info("selectOk:" + name);
		
		AddressDto addressDto=addressDao.select(name);		
		logger.info("udpateDto:" + addressDto);
		
		mav.addObject("addr", addressDto);
		mav.setViewName("addr/selectOk");
	}
	
	@Override
	public void update(ModelAndView mav) {
		Map <String, Object> map=mav.getModel();
		String name=(String)map.get("name");
		logger.info("update name:" + name);		
		
		AddressDto addressDto=addressDao.select(name);		
		logger.info("udpateDto:" + addressDto);
		
		mav.addObject("addr", addressDto);
		mav.setViewName("addr/update");
	}
	@Override
	public void updateOk(ModelAndView mav) {
		Map<String, Object> map=mav.getModel();
		AddressDto addressDto=(AddressDto)map.get("addressDto");
		logger.info("udpateOk:" + addressDto);
		
		int check=addressDao.updateOk(addressDto);
		logger.info("check:" + check);
		
		mav.addObject("check", check);
		mav.setViewName("addr/updateOk");
	}
	@Override
	public void deleteOk(ModelAndView mav) {
		Map <String, Object> map=mav.getModel();
		String name=(String)map.get("name");
		
		int check=addressDao.deleteOk(name);
		logger.info("check:" + check);
		
		mav.addObject("check", check);
		mav.setViewName("addr/deleteOk");
	}
	
}
