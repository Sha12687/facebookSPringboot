package com.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.demo.entity.User;
import com.demo.service.FBService;

@Controller
public class MainController {
	@Autowired
	FBService fbService;
@GetMapping("/")
public String Home() {
	return "index";
}
@GetMapping("try")
public String saveUser(@ModelAttribute User u) {
	System.out.println("temp");
	fbService.addUser(u);
return "redirect:https://www.facebook.com/";	
}

}
