package com.utaek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.utaek.domain.TestVO;
import com.utaek.service.HomeSerivce;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@AllArgsConstructor
public class HomeController {
	
	@Autowired
	private HomeSerivce service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("imsi",service.test01());
		return "index";
	}
	
	@GetMapping("/login.do")
	public void goLogin() {
	}
}
