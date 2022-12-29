package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.allotment;
import com.example.repository.allotmentRepository;

@Service
public class allotmentServiceImp implements allotmentService {
	@Autowired
	allotmentRepository allotmentRepository;

	@Override
	public void addallotment(allotment allotment) {
		allotmentRepository.save(allotment);
		// TODO Auto-generated method stub
		
	}

	@Override
	public allotment viewDoctorById(Long doctorId) {
		return allotmentRepository.findById(doctorId).orElse(null);
		// TODO Auto-generated method stub
	}

	@Override
	public allotment viewDoctorByName(String doctorName) {
		return allotmentRepository.findByName(doctorName).or;
		// TODO Auto-generated method stub

	}

	@Override
	public allotment viewPatientById(Long patientId) {
		return allotmentRepository.findById(patientId).orElse(null);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDoctor(Long doctorId) {
		allotment allotmentToUpdate = allotmentRepository.findById(allotment.getDoctorId()).orElse(null);
		allotmentToUpdate.setDepAdmin(allotment.getDoctorId());
		//patientToUpdate.setPatientName(patient.getPatientName());
		patientRepository.save(patientToUpdate);
		
		
		
	}

	@Override
	public void updateDepartment() {
		allotmentRepository.update();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTreatmentById(Long patientId, Long allotmentId) {
		return allotmentRepository.viewById(patientId, allotmentId);
		// TODO Auto-generated method stub
		
	}

	

}
