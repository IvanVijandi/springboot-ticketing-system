package com.springbootticketingsystem.dto.user;
import com.springbootticketingsystem.model.*;

import java.util.List;


public class UserResponseDTO {

    private Long id;
    private String name;
    private String surname ;
    private String email;
    private UserRol rol;
    private List<Ticket> ticketsCreated;
    private List<Ticket> ticketsAsigned;
    private List<Comment> commentsCreated;


    public UserResponseDTO() {};
    public UserResponseDTO(String name, String surname, String email, UserRol rol){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.rol = rol;

    }

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) { this.surname = surname;}

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }



    public List<Ticket> getTicketsCreated() { return ticketsCreated;}
    public void setTicketsCreated(List<Ticket> ticketsCreated) { this.ticketsCreated = ticketsCreated; }

    public List<Ticket> getTicketsAsigned() { return ticketsAsigned; }
    public void setTicketsAsigned(List<Ticket> ticketsAsigned) { this.ticketsAsigned = ticketsAsigned; }

    public List<Comment> getCommentsCreated() { return commentsCreated; }
    public void setCommentsCreated(List<Comment> commentsCreated) { this.commentsCreated = commentsCreated; }

    public UserRol getRol() { return rol; }
    public void setRol(UserRol rol) { this.rol = rol; }

    public Long getId() { return id; }


}

