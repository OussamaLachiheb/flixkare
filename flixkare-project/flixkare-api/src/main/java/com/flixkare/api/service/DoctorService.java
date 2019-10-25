package com.flixkare.api.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flixkare.api.dao.DoctorDao;
import com.flixkare.api.entity.Doctor;

@Service
public class DoctorService {

	@Autowired
	DoctorDao doctorDao;

	@Transactional
	public Long saveDoctor(Doctor doctor) {
		return doctorDao.save(doctor).getId();
	}
}
