package org.example.Repository;

import org.example.Entity.Department;
import org.springframework.data.repository.Repository;

public interface DepartmentRepository extends Repository<Department, Long> {
}