package com.java.address.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.java.address.dto.AddressDto;
import com.java.address.service.AddressService;


@Controller
public class AddressController{
	private final Logger logger=Logger.getLogger(this.getClass().getName());
	
	@Autowired
	private AddressService addressService;	
	
	@RequestMapping(value="/addr/write.do", method=RequestMethod.GET)
	public String write(HttpServletRequest request, HttpServletResponse response){
		logger.info("write-------");
		return "addr/write";
	}
	
	@RequestMapping(value="/addr/write.do", method=RequestMethod.POST)
	public ModelAndView writeOk(HttpServletRequest request, HttpServletResponse response, AddressDto addressDto){
		ModelAndView mav=new ModelAndView();
		mav.addObject("addressDto", addressDto);
		
		addressService.write(mav);
		return mav;
	}
	
	@RequestMapping(value="/addr/select.do", method=RequestMethod.GET)
	public String select(HttpServletRequest request, HttpServletResponse response){
		logger.info("select-------");
		return "addr/select";
	}
	
	@RequestMapping(value="/addr/select.do", method=RequestMethod.POST)
	public ModelAndView selectOk(HttpServletRequest request, HttpServletResponse response){
		logger.info("selectOk-------");
		String name=request.getParameter("name");
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("name", name);
		addressService.selectOk(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/addr/delete.do", method=RequestMethod.GET)
	public String delete(HttpServletRequest request, HttpServletResponse response){
		return "addr/delete";
	}
	
	@RequestMapping(value="/addr/deleteOk.do", method=RequestMethod.GET)
	public ModelAndView deleteOk(HttpServletRequest request, HttpServletResponse response){
		logger.info("deleteOk-------");		
		ModelAndView mav=new ModelAndView();
			
		String name=request.getParameter("name");
	
		mav.addObject("name", name);
		
		addressService.deleteOk(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/addr/update.do", method=RequestMethod.GET)
	public ModelAndView update(HttpServletRequest request, HttpServletResponse response){
		logger.info("update-------");
		String name=request.getParameter("name");
		
		ModelAndView mav=new ModelAndView();
		if(name==null || name.equals("")){
		
			mav.setViewName("addr/update");
		}else{
			
			mav.addObject("name", name);
			addressService.update(mav);
		}
		return mav;
	}
	
	@RequestMapping(value="/addr/update.do", method=RequestMethod.POST)
	public ModelAndView updateOk(HttpServletRequest request, HttpServletResponse response, AddressDto addressDto){
		logger.info("updateOk-------");		
		ModelAndView mav=new ModelAndView();
			
		mav.addObject("addressDto", addressDto);
		addressService.updateOk(mav);
		
		return mav;
	}
}
