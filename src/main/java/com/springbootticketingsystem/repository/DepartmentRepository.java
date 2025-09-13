package com.springbootticketingsystem.repository;
import com.springbootticketingsystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DepartmentRepository extends JpaRepository<Department, Long> {
}
