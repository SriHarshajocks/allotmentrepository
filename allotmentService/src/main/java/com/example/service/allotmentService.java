package com.example.service;

import com.example.model.allotment;

public interface allotmentService {
	public void addallotment(allotment allotment);

	public allotment viewDoctorById(Long doctorId);

	public allotment viewDoctorByName(String doctorName);

	public allotment viewPatientById(Long patientId);

	public void updateDoctor(Long doctorId);

	public void updateDepartment();

	public void updateTreatmentById(Long patientId, Long allotmentId);
}
