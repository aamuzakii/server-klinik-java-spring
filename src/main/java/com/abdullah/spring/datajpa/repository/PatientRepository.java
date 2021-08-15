package com.abdullah.spring.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah.spring.datajpa.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}