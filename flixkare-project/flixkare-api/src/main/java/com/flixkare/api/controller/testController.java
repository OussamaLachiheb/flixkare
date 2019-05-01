package com.flixkare.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

	@RequestMapping(value="/greeting",method = RequestMethod.GET)
	
	public String greeting() {
		return "bonjour oussama";
	}
}
