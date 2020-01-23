package com.in28minutes.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class LoginController {

    @RequestMapping("/login")
	public String loginMessage(){
		return "Please log in !";
	}

    @RequestMapping(value = "/login")
    @ResponseBody
    public String sayHello() {
        return "Hello World dummy";
    }

    @RequestMapping(value = "/logout")
    @ResponseBody
    public String sayGoodbye() {
        return "ByeBye World dummy";
    }

}