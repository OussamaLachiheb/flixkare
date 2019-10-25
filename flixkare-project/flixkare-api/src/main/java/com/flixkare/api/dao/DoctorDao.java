package com.flixkare.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flixkare.api.entity.Doctor;

@Repository
public interface DoctorDao extends CrudRepository<Doctor,Long> {

}
