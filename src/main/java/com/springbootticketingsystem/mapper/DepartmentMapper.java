package com.springbootticketingsystem.mapper;
import com.springbootticketingsystem.dto.department.DepartmentResponseDTO;
import com.springbootticketingsystem.dto.ticket.TicketRequestDTO;
import com.springbootticketingsystem.model.Department;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    DepartmentResponseDTO toDto(Department department);
    Department toEntity(DepartmentResponseDTO departmentDTO);
}
