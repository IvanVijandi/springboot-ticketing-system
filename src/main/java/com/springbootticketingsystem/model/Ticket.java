package com.springbootticketingsystem.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Ticket {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String code;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TicketState state;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private  TicketPriority priority;
    private Date dateCreated;
    @Column(nullable = true)
    private Date dateModified;
        //Atributos Usuarios


    @ManyToOne
    @JoinColumn(nullable = false)
    private User userCreated;
    @ManyToOne
    @JoinColumn(nullable = false)
    private User userAssigned;
        //Atributos de Departamento
    @ManyToOne
    @JoinColumn(nullable = false)
    private Department department;
        //Atributos de comentario
    @Column(nullable = true)
    @OneToMany(mappedBy = "ticket")
    private List<Comment> comments;

    //Constructores
    public Ticket(){};

    public Ticket(String code, String title, String description, TicketState state, TicketPriority priority, Date dateCreated, Date dateModified, User userCreated, User userAsigned, Department department) {

        this.title = title;
        this.code = code;
        this.description = description;
        this.state = state;
        this.priority = priority;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.userCreated = userCreated;
        this.userAssigned = userAsigned;
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

    public User getUserAssigned() {
        return userAssigned;
    }
    public void setUserAssigned(User userAssigned) {
        this.userAssigned = userAssigned;
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Comment> getComments() { return comments; }
    public void setComments(List<Comment> comments) { this.comments = comments; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }


}
