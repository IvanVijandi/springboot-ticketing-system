package com.springbootticketingsystem.dto.ticket;

import com.springbootticketingsystem.dto.comment.CommentRequestDTO;
import com.springbootticketingsystem.model.*;

import java.util.Date;
import java.util.List;

public class TicketResponseDTO {

    private String code;
    private String title;
    private String description;
    private TicketState state;
    private TicketPriority priority;
    private Date dateCreated;
    private Date dateModified;
    //Relaciones
    private String userCreatedEmail;
    private String userAssignedEmail;
    private String departmentName;
    private List<CommentRequestDTO> commentsDTO;

    public TicketResponseDTO() {
    }

    public TicketResponseDTO(
             String code, String title, String description,
            TicketState state, TicketPriority priority,
            Date dateCreated, Date dateModified,
            String userCreatedEmail, String userAssignedEmail,
            String departmentName, List<CommentRequestDTO> commentsDTO) {

        this.code = code;
        this.title = title;
        this.description = description;
        this.state = state;
        this.priority = priority;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.userAssignedEmail = userAssignedEmail;
        this.userCreatedEmail = userCreatedEmail;
        this.departmentName = departmentName;
        this.commentsDTO = commentsDTO;
    }

    // Getters & setters

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TicketState getState() {
        return state;
    }

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

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getUserCreatedEmail() {
        return userCreatedEmail;
    }

    public void setUserCreatedEmail(String userCreatedEmail) {
        this.userCreatedEmail = userCreatedEmail;
    }

    public String getUserAssigned() {
        return userAssignedEmail;
    }

    public void setUserAssignedEmail(String userAssignedEmail) {
        this.userAssignedEmail = userAssignedEmail;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<CommentRequestDTO> getComments() {
        return commentsDTO;
    }

    public void setComments(List<CommentRequestDTO> commentsDTO) {
        this.commentsDTO = commentsDTO;
    }

}
