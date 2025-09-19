package com.springbootticketingsystem.dto.comment;

import com.springbootticketingsystem.dto.user.UserResponseDTO;

import java.util.Date;

public class CommentResponseDTO {

    //Atributos
    private Long id;
    private String commentContent;
    private Date dateCreated;
    //Atributos de usuarios
    private String authorName;
    //Atributos de Ticket
    private String ticketCode;


    //Constructor
    public CommentResponseDTO(Long id, String commentContent, Date dateCreated, String authorName, String ticketCode) {
        this.id = id;
        this.commentContent = commentContent;
        this.dateCreated = dateCreated;
        this.authorName = authorName;
        this.ticketCode = ticketCode;
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

    public String getAuthor(){
        return authorName;
    }
    public void setAuthorName(String  authorName){
        this.authorName = authorName;
    }

    public String getTicketCode(){
        return ticketCode;
    }
    public void setTicketCode(String ticketCode){
        this.ticketCode = ticketCode;
    }

}
