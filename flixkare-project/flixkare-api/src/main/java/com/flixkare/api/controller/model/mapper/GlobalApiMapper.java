package com.flixkare.api.controller.model.mapper;

import org.springframework.stereotype.Component;

import com.flixkare.api.entity.Doctor;

@Component
public class GlobalApiMapper {
	
	public Doctor convertDoctorFromDto(com.flixkare.api.controller.model.dto.Doctor doctorDto) {
		Doctor result=new Doctor();
		result.setId(doctorDto.getId());
		result.setFirstName(doctorDto.getFirstName());
		result.setLastName(doctorDto.getLastName());
		result.setAdress(doctorDto.getAdress());
		return result;
	}

}
