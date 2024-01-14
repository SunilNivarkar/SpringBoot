package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.IWishMessageService;

@Controller
public class WishMessageGenerator {
	@Autowired 
	private IWishMessageService service;
	@RequestMapping("/")
	public String showMessage() {
		return "home";  //LVN
	}
	/*	@RequestMapping("/wish")
		public ModelAndView generateMessage() {
			//use service
			String result=service.generateWishMessage();
			//return MAV
			ModelAndView mav=new ModelAndView();
			mav.addObject("wMsg",result); //Like this we can any number of attribute
			mav.setViewName("display");
			return mav;
			//in this constructor first is LVN ,ModelAttr name MAvalue
			//return new ModelAndView("display","wMsg",result); //Here we can only one model attribute
			
			
			
		}*/
	
	@RequestMapping("/wish")
	public void generateMessage(Model model) {
		System.out.println("Shared Memory object class name:"+model.getClass());
		//use service
		String result=service.generateWishMessage();
		model.addAttribute("wMsg", result);
	}

}
