package com.utaek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utaek.service.UserService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/user/*")
public class UserController {
	
	private UserService service;
	
	//로그인창으로 이동
	@GetMapping("userlogin.do")
	public void goLogin() {
		
	}
	
}
