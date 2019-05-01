package com.flixkare.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @author Oussama Lachiheb 
 * Entity class for doctor table and columns
 *
 */
@Entity
@Table(name = "DOCTOR")
public class Doctor implements Serializable {

	private static final long serialVersionUID = -2295633566366041278L;

	@Id
	@GeneratedValue(generator = "doctor_id_generator")
	@SequenceGenerator(name = "doctor_id_generator", sequenceName = "doctor_id_sequence", initialValue = 21600)
	private Long id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "ADRESS", columnDefinition = "text")
	private String adress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	
}
