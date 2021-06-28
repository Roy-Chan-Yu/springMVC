package com.pouchen.roy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String show() {
		return "index";
	}
	
	@RequestMapping("/hello")
	public String redirect() {
		return "viewpage";
	}
	
	@RequestMapping("/again")
	public String again() {
		return "final";
	}
}
