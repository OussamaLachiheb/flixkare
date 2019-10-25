package com.flixkare.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flixkare.api.controller.model.dto.Doctor;
import com.flixkare.api.controller.model.mapper.GlobalApiMapper;
import com.flixkare.api.service.DoctorService;

@RestController
public class TechnicalControllerApi {

@Autowired
GlobalApiMapper globalMapper;

@Autowired
DoctorService doctorService;

@RequestMapping(value="/saveDoctor",method = RequestMethod.POST)	
	public Long createDoctor(@RequestBody Doctor doctor) {
		return doctorService.saveDoctor(globalMapper.convertDoctorFromDto(doctor));
	}
}
