package com.springbootticketingsystem.model;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {

    //Atributos
    @Id
    private Long Id;
    private String name;
        //Atributos de ticket
    @OneToMany(mappedBy = "department")
    private List<Ticket> tickets;

    //Constructores
    public Department(){};
    public Department(Long id,String name){
        this.Id=id;
        this.name=name;
    }

    //Getters and Setters
    public Long getId() { return Id; }
    public void setId(Long id) { this.Id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Ticket> getTickets() { return tickets; }
    public void setTickets(List<Ticket> tickets) { this.tickets = tickets; }



}
