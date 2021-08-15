package com.abdullah.spring.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah.spring.datajpa.model.Tutorial;

public interface PatientRepository extends JpaRepository<Tutorial, Long> {
    // List<Tutorial> findByPublished(boolean published);
    // List<Tutorial> findByTitleContaining(String title);
}