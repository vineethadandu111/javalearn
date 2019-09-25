package com.vineethagloo.demospringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//this is HelloWorld controller
@Controller
public class MainController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Hello World!!!";
	}

}
