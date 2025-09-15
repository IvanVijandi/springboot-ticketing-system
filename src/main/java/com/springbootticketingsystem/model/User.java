package com.springbootticketingsystem.model;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname ;
    @Column(unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRol rol;
    //Atributos de ticket
    @Column(nullable = true)
    @OneToMany(mappedBy = "userCreated")
    private List<Ticket> ticketsCreated;
    @Column(nullable = true)
    @OneToMany(mappedBy = "userAsigned")
    private List<Ticket> ticketsAsigned;
    @Column(nullable = true)
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
    public void setName(String name) {
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

    public UserRol getRol() { return rol; }
    public void setRol(UserRol rol) { this.rol = rol; }

}
