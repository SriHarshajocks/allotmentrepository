package com.example.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "allotment_Table")
public class allotment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long allotmentId;
	private Long patientId;
	private Long doctorId;
	private Date dateOfAllotment;
	private String treatment;
	private Long departmentId;
	

	public Long getAllotmentId() {
		return allotmentId;
	}

	public void setAllotmentId(Long allotmentId) {
		this.allotmentId = allotmentId;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public Date getDateOfAllotment() {
		return dateOfAllotment;
	}

	public void setDateOfAllotment(Date dateOfAllotment) {
		this.dateOfAllotment = dateOfAllotment;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	
	

}
