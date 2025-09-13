package com.springbootticketingsystem.repositories;

import com.springbootticketingsystem.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

interface DepartmentRepository extends JpaRepository<Department, Long> {
}
