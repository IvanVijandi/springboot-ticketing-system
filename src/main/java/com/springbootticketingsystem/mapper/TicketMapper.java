package com.springbootticketingsystem.mapper;
import com.springbootticketingsystem.dto.ticket.TicketRequestDTO;
import com.springbootticketingsystem.dto.ticket.TicketResponseDTO;
import com.springbootticketingsystem.model.Ticket;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface TicketMapper {

    TicketResponseDTO toDto(Ticket ticket);
    Ticket toEntity(TicketRequestDTO ticketRequestDTO);
}
