package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/hello")
public class Hello {

	@RequestMapping(value="/sayHello")
	public @ResponseBody String sayHello() {
		return "Hello World";
	}
	
	@RequestMapping(value="/add")
	public @ResponseBody String add(int add1, int add2) {
		return "add1 + add2 = " + (add1 + add2);
	}
}
