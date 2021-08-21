package com.abdullah.spring.datajpa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.abdullah.spring.datajpa.model.Patient;
import com.abdullah.spring.datajpa.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class PatientController {

    @Autowired
    PatientRepository patientRepository;
    @GetMapping("/patients")
    public ResponseEntity<List<Patient>> getAllPatients() {
        try {
            List<Patient> patients = new ArrayList<Patient>();

            patientRepository.findAll().forEach(patients::add);

            if (patients.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(patients, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/patients/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("id") long id) {
        Optional<Patient> tutorialData = patientRepository.findById(id);

        if (tutorialData.isPresent()) {
            return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/patients")
    public ResponseEntity<Patient> createTutorial(@RequestBody Patient patient) {
        try {
            System.out.println(patient);
            Patient _patient = patientRepository.save(new Patient(patient.getPatientName(), patient.getBirthDate(), patient.getPhoneNumber()));
            return new ResponseEntity<>(_patient, HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println("masuk catch");
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/patients/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable("id") long id, @RequestBody Patient patient) {
        Optional<Patient> tutorialData = patientRepository.findById(id);

        if (tutorialData.isPresent()) {
            Patient _patient = tutorialData.get();
            return new ResponseEntity<>(patientRepository.save(_patient), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/patients/{id}")
    public ResponseEntity<HttpStatus> deletePatient(@PathVariable("id") long id) {
        try {
            patientRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}