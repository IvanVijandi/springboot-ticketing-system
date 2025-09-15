package com.springbootticketingsystem.dto.ticket;

import com.springbootticketingsystem.model.Department;
import com.springbootticketingsystem.model.TicketPriority;
import com.springbootticketingsystem.model.TicketState;
import com.springbootticketingsystem.model.User;

import java.util.Date;

public class TicketDTO {

    //Atributos
    private Long id;
    private String title;
    private String description;
    private TicketState state;
    private TicketPriority priority;
    private Date dateCreated;
    private Date dateModified;
        //Atributos Usuarios
    private User userCreated;
    private User userAsigned;
        //Atributos de Departamento
    private Department department;

    //Constructores
    public TicketDTO(String title, String description, TicketState state, TicketPriority priority, Date dateCreated, Date dateModified, User userCreated, User userAsigned, Department department) {

        this.title = title;
        this.description = description;
        this.state = state;
        this.priority = priority;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.userCreated = userCreated;
        this.userAsigned = userAsigned;
        this.department = department;

    }

    //Getters y setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public TicketState getState() { return state; }
    public void setState(TicketState state) {
        this.state = state;
    }

    public TicketPriority getPriority() {
        return priority;
    }
    public void setPriority(TicketPriority priority) {
        this.priority = priority;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) { this.dateCreated = dateCreated; }

    public Date getDateModified() {
        return dateModified;
    }
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public User getUserCreated() {
        return userCreated;
    }
    public void setUserCreated(User userCreated) {
        this.userCreated = userCreated;
    }

    public User getUserAsigned() {
        return userAsigned;
    }
    public void setUserAsigned(User userAsigned) {
        this.userAsigned = userAsigned;
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

}
