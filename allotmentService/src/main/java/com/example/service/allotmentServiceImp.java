package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.allotment;
import com.example.repository.allotmentRepository;
import com.paperlesshospital.patient.model.Patient;

@Service
public class allotmentServiceImp implements allotmentService {
	@Autowired
	allotmentRepository allotmentRepository;

	@Override
	public void addallotment(allotment allotment) {
		allotmentRepository.save(allotment);
		
	}

	@Override
	public allotment viewDoctorById(Long doctorId) {
		return allotmentRepository.findById(doctorId).orElse(null);
	}

	@Override
	public allotment viewDoctorByName(String doctorName) {
		return allotmentRepository.findByName(doctorName);
		// TODO Auto-generated method stub

	}

	@Override
	public allotment viewPatientById(Long patientId) {
		
		return allotmentRepository.findById(patientId).orElse(null);
				
	}

	@Override
	public void updateDoctor(allotment allotment) {
		allotment doctorToUpdate = allotmentRepository.findById(allotment.getDoctorId()).orElse(null);
		doctorToUpdate.setDoctorId(allotment.getDoctorId());
		//patientToUpdate.setPatientName(patient.getPatientName());
		allotmentRepository.save(doctorToUpdate);
	}

	@Override
	public void updateDepartment(allotment allotment) {
		allotment departmentToUpdate = allotmentRepository.findById(allotment.getDepartmentId()).orElse(null);
		departmentToUpdate.setDepartmentId(allotment.getDepartmentId());
		allotmentRepository.save(departmentToUpdate);
		
	}

	@Override
	public void updateTreatmentByPatientId(Long patientId) {
		
		allotmentRepository.findById(patientId).orElse(null);
		
	}
	
	@Override
	public void updateTreatmentByAllotmentId(Long allotmentId) {
		
		allotmentRepository.findById(allotmentId).orElse(null);
		
	}
	

}
