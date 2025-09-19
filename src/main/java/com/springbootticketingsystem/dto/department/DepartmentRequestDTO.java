package com.springbootticketingsystem.dto.department;
import com.springbootticketingsystem.model.*;

import java.util.List;


public class DepartmentRequestDTO {

    private Long Id;
    private String name;
    private List<Ticket> tickets;

    public DepartmentRequestDTO(Long id, String name, List<Ticket> tickets) {
        this.Id=id;
        this.name=name;
        this.tickets=tickets;
    }

    public Long getId() { return Id; }

    public void setId(Long id) { this.Id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Ticket> getTickets() { return tickets; }

    public void setTickets(List<Ticket> tickets) { this.tickets = tickets; }





}
