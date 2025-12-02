package org.example.Repository;

import org.example.Entity.Doctor;
import org.springframework.data.repository.Repository;

public interface DoctorRepository extends Repository<Doctor, Long> {
}