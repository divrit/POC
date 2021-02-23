package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Feign.callMS1;

@RestController

public class Controller {
	@Autowired
	public callMS1 call;
	
	@GetMapping("/feign")
	public String msg() {
		return call.val();
	}
	
	@GetMapping("check")
	public int value() {
		return call.va();
	}
	@GetMapping("/hi")
	public String hi() {
		return "hi";
	}

}
