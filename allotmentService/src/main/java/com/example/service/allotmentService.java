package com.example.service;

import com.example.model.allotment;

public interface allotmentService {
	public void addallotment(allotment allotment);

	public allotment viewDoctorById(Long doctorId);

	public allotment viewDoctorByName(String doctorName);

	public allotment viewPatientById(Long patientId);

	public void updateDoctor(allotment doctorId);

	public void updateDepartment(allotment allotment);

	public void updateTreatmentByPatientId(Long patientId);
	
	public void updateTreatmentByAllotmentId(Long allotmentId);
}
