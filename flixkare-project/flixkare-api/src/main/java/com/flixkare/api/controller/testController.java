package com.flixkare.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

	@RequestMapping("/greeting")
	public String greeting() {
		return "bonjour oussama";
	}
}
