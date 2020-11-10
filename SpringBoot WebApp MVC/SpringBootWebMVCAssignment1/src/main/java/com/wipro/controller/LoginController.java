package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping("/") 
	public String getLoginPage() {
		return "LoginPage";
	}
	@RequestMapping("/Login")
	public String validateLogin(@RequestParam String uname, @RequestParam String pwd) {
		if(uname.equals("wipro")&&pwd.equals("Wipro@123")) {
			return "LoginSuccess";
		}
		else {
			return "LoginFailure";
		}
	}
}
