package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.allotment;
import com.example.service.allotmentServiceImp;

@RestController
public class allotmentController {
	@Autowired
	allotmentServiceImp allotmentServiceImp;

	@PostMapping("/addallotment")
	public void addpatient(@RequestBody allotment allotment) {
		allotmentServiceImp.addallotment(allotment);
	}

	@GetMapping("/getDoctorById")
	public allotment getDoctorById(@PathVariable Long doctorId) {
		return allotmentServiceImp.getDoctorById(doctorId);
	}

	@GetMapping("/getDoctorByName")
	public allotment getDoctorByName(@PathVariable String doctorName) {
		return allotmentServiceImp.getDoctorByName(doctorName);
	}

	@GetMapping("/viewDoctorById")
	public allotment viewPatientById(@PathVariable Long patientId) {
		return allotmentServiceImp.viewPatientById(patientId);
	}

	@PutMapping("/updateDoctor")
	public void updateDoctor() {
		allotmentServiceImp.updateDoctor();
	}

	@PutMapping("/updateDoctor")
	public void updateDepartment() {
		allotmentServiceImp.updateDepartment();
	}

	@PutMapping("/updateTreatmentById")
	public allotment updateTreatmentById(@PathVariable Long patientId, Long allotmentId) {
		return allotmentServiceImp.updateTreatmentById(patientId, allotmentId);
	}

}
