package com.springbootticketingsystem.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import  java.util.Date;

@Entity
public class Comment {

    @Id
    private Long id;
    private String commentContent;
    private Date dateCreated;
    //Atributos de usuarios
    @ManyToOne
    private User author;
    @ManyToOne
    private Ticket ticket;


    //Constructores
    public Comment(){};

    public Comment(Long id, String commentContent, Date dateCreated, User user) {
        this.id = id;
        this.commentContent = commentContent;
        this.dateCreated = dateCreated;
        this.author = user;
    }

    //Getters y Setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getCommentContent(){ return commentContent; }
    public void setCommentContent(String commentContent){
        this.commentContent = commentContent;
    }

    public Date getDateCreated(){
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated){ this.dateCreated = dateCreated; }

    public User getAuthor(){
        return author;
    }
    public void setAuthor(User author){
        this.author = author;
    }

    public Ticket getTicket(){
        return ticket;
    }
    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }


}
