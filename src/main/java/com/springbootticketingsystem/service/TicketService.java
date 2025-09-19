package com.springbootticketingsystem.service;
import com.springbootticketingsystem.model.*;
import com.springbootticketingsystem.repository.*;
import com.springbootticketingsystem.mapper.*;
import com.springbootticketingsystem.dto.ticket.*;
import org.springframework.stereotype.Service;
import com.aventrix.jnanoid.jnanoid.NanoIdUtils;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;
    private final DepartmentRepository departmentRepository;
    private final UserRepository userRepository;
    private final  TicketMapper ticketMapper;


    public TicketService(TicketRepository ticketRepository, TicketMapper ticketMapper, DepartmentRepository departmentRepository,  UserRepository userRepository) {

        this.ticketRepository = ticketRepository;
        this.departmentRepository = departmentRepository;
        this.userRepository = userRepository;
        this.ticketMapper = ticketMapper;
    }

    //CREAR TICKET
    public TicketResponseDTO createTicket(TicketRequestDTO dto) {

        //Buscamos department
        Department dept = departmentRepository.findById(dto.getDepartmentId())
                .orElseThrow(() -> new IllegalArgumentException("Department not found"));
        //Buscamos usuario Creador
        User userCreated = userRepository.findById(dto.getUserCreatedId())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        //Buscamos usuario asignado al ticket
        User userAsigned = userRepository.findById(dto.getUserAsignedId())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        String codigo = NanoIdUtils.randomNanoId();
        Ticket ticket = ticketMapper.toEntity(dto);
        ticket.setCode(codigo);
        ticket.setDepartment(dept);
        ticket.setUserAssigned(userAsigned);
        ticket.setUserCreated(userCreated);
        Ticket ticketCreated = ticketRepository.save(ticket);

        return  ticketMapper.toDto(ticketCreated);
    }


    //OBTENER TICKET
    public TicketResponseDTO getTicketById(Long ticketId) {

        Ticket ticket = ticketRepository.findById(ticketId)
                .orElseThrow(() -> new IllegalArgumentException("Ticket not found"));

        return   ticketMapper.toDto(ticket);
    }

    public TicketResponseDTO getTicketByCode(String code) {

        Ticket ticket = ticketRepository.findByCode(code);
        if (ticket != null) {
            return  ticketMapper.toDto(ticket);
        }
        else {
            throw new IllegalArgumentException("Ticket not found");
        }

    }

    //BORRAR TICKET
    public TicketResponseDTO deleteTicketById(Long id) {

        Ticket ticket =  ticketRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Ticket not found"));
        ticketRepository.delete(ticket);
        return  ticketMapper.toDto(ticket);
    }

    public TicketResponseDTO deleteTicketByCode(String code) {

        Ticket ticket =  ticketRepository.findByCode(code);

        if (ticket != null) {
            ticketRepository.delete(ticket);
            return  ticketMapper.toDto(ticket);
        }
        else{
            throw new IllegalArgumentException("Ticket not found");
        }
    }

    //MODIFICAR
    public TicketResponseDTO updateTicket(Long ticketId, TicketRequestDTO dto) {

        Ticket ticket = ticketRepository.findById(ticketId)
                .orElseThrow(() -> new IllegalArgumentException("Ticket not found"));


        if (dto.getTitle() != null) ticket.setTitle(dto.getTitle());
        if (dto.getDescription() != null) ticket.setDescription(dto.getDescription());
        if (dto.getState() != null) ticket.setState(dto.getState());
        if (dto.getPriority() != null) ticket.setPriority(dto.getPriority());


        if (dto.getUserAsignedId() != null) {
            User userAssigned = userRepository.findById(dto.getUserAsignedId())
                    .orElseThrow(() -> new IllegalArgumentException("Assigned user not found"));
            ticket.setUserAssigned(userAssigned);
        }

        if (dto.getDepartmentId() != null) {
            Department dept = departmentRepository.findById(dto.getDepartmentId())
                    .orElseThrow(() -> new IllegalArgumentException("Department not found"));
            ticket.setDepartment(dept);
        }


        Ticket updated = ticketRepository.save(ticket);


        return ticketMapper.toDto(updated);
    }
}









