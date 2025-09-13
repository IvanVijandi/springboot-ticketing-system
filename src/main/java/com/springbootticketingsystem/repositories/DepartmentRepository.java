package com.springbootticketingsystem.repositories;
import com.springbootticketingsystem.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DepartmentRepository extends JpaRepository<Department, Long> {
}
