package com.pouchen.roy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController1 {
	@RequestMapping("/hello1")
	public String display() {
		return "final";
	}
	@RequestMapping("/hello2")
	public String show() {
		return "final";
	}
	@RequestMapping("/hello3")
	public String build() {
		return "final";
	}
	@RequestMapping("/hello4")
	public String deploy() {
		return "final";
	}
	
}
