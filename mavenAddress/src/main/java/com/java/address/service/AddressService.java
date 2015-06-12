package com.java.address.service;

import org.springframework.web.servlet.ModelAndView;

public interface AddressService {
	public void write(ModelAndView mav);
	public void selectOk(ModelAndView mav);
	public void deleteOk(ModelAndView mav);
	public void update(ModelAndView mav);
	public void updateOk(ModelAndView mav);
}
