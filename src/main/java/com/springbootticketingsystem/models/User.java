package com.springbootticketingsystem.models;
import jakarta.persistence.*;
import com.springbootticketingsystem.models.*;

import java.util.List;

@Entity
public class User {

    @Id
    private Long  id;

    private String name;
    private String surname ;
    private String email;
    private String password;
    private UserRol rol;
    //Atributos de ticket
    @OneToMany(mappedBy = "userCreated")
    private List<Ticket> ticketsCreated;
    @OneToMany(mappedBy = "userAsigned")
    private List<Ticket> ticketsAsigned;
    @OneToMany
    private List<Comment> commentsCreated;

    //Constructores
    public User (){}; //Constructor JPA
    public User(String name, String surname, String email, String password, UserRol rol){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.rol = rol;

    }

    //getters and setters
    public String getName() {
        return name;
    }
    public void setNombre(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
