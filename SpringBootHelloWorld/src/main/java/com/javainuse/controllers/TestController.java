package com.javainuse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/hello")  
	public String hello() {   
	 return  "Hello, world"; 
	 }
	
	@RequestMapping("/welcomes")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}

}
