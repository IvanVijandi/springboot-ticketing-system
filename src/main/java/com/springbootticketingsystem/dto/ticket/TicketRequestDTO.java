package com.springbootticketingsystem.dto.ticket;
import com.springbootticketingsystem.model.*;

import java.util.Date;
import java.util.List;

public class TicketRequestDTO {

    //Atributos
    private Long id;
    private String code;
    private String title;
    private String description;
    private TicketState state;
    private TicketPriority priority;
    private Date dateCreated;
    private Date dateModified;
        //Atributos Usuarios
    private Long  userCreatedId;
    private Long userAsignedId;
        //Atributos de Departamento
    private Long departmentId;
        //Comentarios
    private List<Comment> comments;

    //Constructores
    public TicketRequestDTO() {}
    public TicketRequestDTO(Long id, String code, String title, String description, TicketState state, TicketPriority priority, Date dateCreated, Date dateModified, Long userCreatedId, Long userAsignedId, Long departmentId, List<Comment> comments) {

        this.id = id;
        this.code = code;
        this.comments = comments;
        this.title = title;
        this.description = description;
        this.state = state;
        this.priority = priority;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.userCreatedId = userCreatedId;
        this.userAsignedId = userAsignedId;
        this.departmentId = departmentId;

    }

    //Getters y setters

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code;}

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

    public Long getUserCreatedId() {
        return userCreatedId;
    }
    public void setUserCreatedId(Long userCreatedId) {
        this.userCreatedId = userCreatedId;
    }

    public Long getUserAsignedId() {
        return userAsignedId;
    }
    public void setUserAsignedId(Long userAsignedId) { this.userAsignedId = userAsignedId; }

    public Long getDepartmentId() {
        return departmentId;
    }
    public void setDepartment(Long departmentId) {
        this.departmentId = departmentId;
    }

    public List<Comment> getComments() { return comments; }
    public void setComments(List<Comment> comments) { this.comments = comments; }


}
