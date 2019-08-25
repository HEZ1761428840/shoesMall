package com.yc.shoesMall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class register {
		
		@GetMapping("login-register")
		public String register() {
			return "login";
		}
}
