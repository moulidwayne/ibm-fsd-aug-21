package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index()
    {
        return "welcome";
    }
    @RequestMapping("/home")
    public String showHome()
    {
        return "index";
    }
}
