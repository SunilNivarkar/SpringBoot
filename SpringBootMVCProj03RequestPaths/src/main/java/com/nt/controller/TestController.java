package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/")
	public String showHome() {
		return "home";
	}
	
	/*@RequestMapping("/REPORT")
	public String showReport(Map<String,Object>map) {
	System.out.println("TestController.showReport()");
		return "display";
	}
	
	@RequestMapping("/report")
	public String showReport1(Map<String,Object>map) {
		System.out.println("TestController.showReport1()");
		return "display1";
	}*/
 	//@RequestMapping(value="/REPORT",method = RequestMethod.GET)
	//@GetMapping("/REPORT")
	@GetMapping(value={"/REPORT1","/REPORT2","/REPORT3"})
	public String showReport(Map<String,Object>map) {
	System.out.println("TestController.showReport()");
		return "display";
	}
	
	//@RequestMapping(value="/REPORT",method=RequestMethod.POST)
	@PostMapping("/REPORT")
	public String showReport1(Map<String,Object>map) {
		System.out.println("TestController.showReport1()");
		return "display1";
	}

}
