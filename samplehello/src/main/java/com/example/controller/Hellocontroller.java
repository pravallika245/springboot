package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hellocontroller {

	@GetMapping("sayhi")
	@ResponseBody
	String sayhello(){
		return "sayhello";
	}
}
