package com.pouchen.roy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecurityController {
	
	@RequestMapping(value = "/security", method = RequestMethod.GET)
	public String home() {
		return "security/home";
	}
	
	@RequestMapping(value = "/security/admin", method = RequestMethod.GET)
	public String privateHome() {
		return "security/privatePage";
	}
}
