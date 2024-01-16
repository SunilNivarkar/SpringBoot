package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	@GetMapping(value= {"/REPORT"})
	public String generateReport(Map<String,Object>map ) {
		System.out.println("DemoController.generateReport()");
		return "display";
	}

}
