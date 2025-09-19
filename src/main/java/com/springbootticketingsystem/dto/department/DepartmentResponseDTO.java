package com.springbootticketingsystem.dto.department;

import com.springbootticketingsystem.dto.ticket.TicketResponseDTO;
import com.springbootticketingsystem.model.Ticket;

import java.util.List;

public class DepartmentResponseDTO {


    private Long Id;
    private String name;


    public DepartmentResponseDTO(Long id, String name ) {
        this.Id=id;
        this.name=name;

    }

    public Long getId() { return Id; }

    public void setId(Long id) { this.Id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }





}
