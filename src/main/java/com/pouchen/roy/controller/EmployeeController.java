package com.pouchen.roy.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pouchen.roy.bean.Employee;

@Controller
@RequestMapping("/validate")
public class EmployeeController {

	@RequestMapping("/emp")
	public String display(Model m) {
		m.addAttribute("emp", new Employee());
		return "validate/viewpage";
	}

	@RequestMapping("/sumitEmp")
	public String submitForm(@Valid@ModelAttribute("emp")Employee e, BindingResult br) {
		if(br.hasErrors()) {
			return "validate/viewpage";
		}
		else {
			return "validate/final";
		}
		
	}
	
}