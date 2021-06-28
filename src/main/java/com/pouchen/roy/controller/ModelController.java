package com.pouchen.roy.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModelController {
	
	@RequestMapping("/model")
	public String show() {
		return "/model/index";
	}

	@RequestMapping("/modelDisplay")
	public String display(HttpServletRequest req, Model m) throws UnsupportedEncodingException {
		
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		if(pass.equals("password")) {
			String msg = "hello " + name;
			m.addAttribute("response", msg);
			return "model/model-success";
		}
		else {
			String msg = "Sorry " +name + " . U entered an incorrect password...";
			m.addAttribute("response", msg);
			return "model/model-error";
		}
	}
	@RequestMapping("modelDisplay1")
	public String display1(@RequestParam("name")String name,@RequestParam("password")String password, Model m) {
		
		
		if("password".equals(password)) {
			String msg = "Hello " + name;
			m.addAttribute("response", msg);
			return "model/model-success";
		}
		else {
			String msg = "Sorry "+name + ". You entered an incorrect password...";
			m.addAttribute("response", msg);
			return "model/model-error";
		}
	}
}
