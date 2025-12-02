package org.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
