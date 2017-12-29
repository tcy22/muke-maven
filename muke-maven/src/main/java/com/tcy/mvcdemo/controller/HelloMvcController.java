package com.tcy.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloMvcController {
	
	@RequestMapping("/mvc")
	public String helloMvc() {//host:8080/hello/mvc
		System.out.println("home");
		return "home";//去找home.jsp
	}

}
