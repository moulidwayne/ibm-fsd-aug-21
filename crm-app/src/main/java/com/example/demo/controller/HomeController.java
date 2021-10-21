package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showForm()
	{
		return "index";
	}
	
	@RequestMapping("/processForm")
	public String sayHello(@RequestParam("t1")String name,Model model)
	{
		model.addAttribute("NAME",name);
		return "hello";
	}

}
