package com.springbootticketingsystem.dto.ticket;

import com.springbootticketingsystem.dto.comment.CommentDTO;
import com.springbootticketingsystem.dto.department.DepartmentDTO;
import com.springbootticketingsystem.dto.user.UserResponseDTO;
import com.springbootticketingsystem.model.*;

import java.util.Date;
import java.util.List;

public class TicketResponseDTO {

    private Long id;
    private String code;
    private String title;
    private String description;
    private TicketState state;
    private TicketPriority priority;
    private Date dateCreated;
    private Date dateModified;


    private UserResponseDTO userCreated;
    private UserResponseDTO userAsigned;

    private DepartmentDTO departmentDTO;
    private List<CommentDTO> commentsDTO;

    public TicketResponseDTO() {}

    public TicketResponseDTO(
            Long id, String code, String title, String description,
            TicketState state, TicketPriority priority,
            Date dateCreated, Date dateModified,
            UserResponseDTO userCreated, UserResponseDTO userAsigned,
            DepartmentDTO departmentDTO, List<CommentDTO> commentsDTO) {

        this.id = id;
        this.code = code;
        this.title = title;
        this.description = description;
        this.state = state;
        this.priority = priority;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.userCreated = userCreated;
        this.userAsigned = userAsigned;
        this.departmentDTO =  departmentDTO;
        this.commentsDTO = commentsDTO;
    }

    // Getters & setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public TicketState getState() { return state; }
    public void setState(TicketState state) { this.state = state; }

    public TicketPriority getPriority() { return priority; }
    public void setPriority(TicketPriority priority) { this.priority = priority; }

    public Date getDateCreated() { return dateCreated; }
    public void setDateCreated(Date dateCreated) { this.dateCreated = dateCreated; }

    public Date getDateModified() { return dateModified; }
    public void setDateModified(Date dateModified) { this.dateModified = dateModified; }

    public UserResponseDTO getUserCreated() { return userCreated; }
    public void setUserCreated(UserResponseDTO userCreated) { this.userCreated = userCreated; }

    public UserResponseDTO getUserAsigned() { return userAsigned; }
    public void setUserAsigned(UserResponseDTO userAsigned) { this.userAsigned = userAsigned; }

    public DepartmentDTO getDepartment() { return departmentDTO; }
    public void setDepartment(DepartmentDTO departmentDTO) { this.departmentDTO = departmentDTO; }

    public List<CommentDTO> getComments() { return commentsDTO; }
    public void setComments(List<CommentDTO> commentsDTO) { this.commentsDTO = commentsDTO; }
}
