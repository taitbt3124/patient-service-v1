package com.medical.patientservicev1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<com.medical.patientservice.Patient, Long> {}