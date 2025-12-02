package org.example.Repository;

import org.example.Entity.Appointment;
import org.springframework.data.repository.Repository;

public interface AppointmentRepository extends Repository<Appointment, Long> {
}