package com.springbootticketingsystem.mapper;
import com.springbootticketingsystem.dto.ticket.TicketRequestDTO;
import com.springbootticketingsystem.dto.ticket.TicketResponseDTO;
import com.springbootticketingsystem.model.Ticket;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel="spring",uses = {CommentMapper.class})
public interface TicketMapper {

    @Mapping(source = "userCreated.email", target = "userCreatedEmail")
    @Mapping(source = "userAssigned.email", target = "userAssignedEmail")
    @Mapping(source = "department.name", target = "departmentName")
    TicketResponseDTO toDto(Ticket ticket);
    Ticket toEntity(TicketRequestDTO ticketRequestDTO);
}
