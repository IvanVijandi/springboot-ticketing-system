package com.springbootticketingsystem.mapper;
import com.springbootticketingsystem.dto.ticket.TicketResponseDTO;
import org.springframework.stereotype.Component;
import com.springbootticketingsystem.model.Ticket;
import com.springbootticketingsystem.dto.ticket.TicketRequestDTO;
import com.springbootticketingsystem.dto.user.UserResponseDTO;

@Component
public class TicketMapper {

    public Ticket toEntity(TicketRequestDTO ticketDTO, String codigo) {

        Ticket ticket = new Ticket();
        ticket.setTitle(ticketDTO.getTitle());
        ticket.setDescription(ticketDTO.getDescription());
        ticket.setState(ticketDTO.getState());
        ticket.setPriority(ticketDTO.getPriority());
        ticket.setDateCreated(ticketDTO.getDateCreated());
        ticket.setDateModified(ticketDTO.getDateModified());
        ticket.setCode(codigo);

        return ticket;

    }

    //ticket viene de la bsdd con las relaciones ya hechas
    public TicketResponseDTO toDto(Ticket ticket){

        TicketResponseDTO dto = new TicketResponseDTO();
        dto.setTitle(ticket.getTitle());
        dto.setDescription(ticket.getDescription());
        dto.setState(ticket.getState());
        dto.setPriority(ticket.getPriority());
        dto.setDateCreated(ticket.getDateCreated());
        dto.setDateModified(ticket.getDateModified());
        dto.setUserCreated(ticket.getUserCreated());
        dto.setUserAsigned(ticket.getUserAsigned());
        dto.setDepartment(ticket.getDepartment());
        dto.setComments(ticket.getComments());
        dto.setCode(ticket.getCode());
        return dto;
    }

}
