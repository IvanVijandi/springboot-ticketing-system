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
        ticket.setUserAsigned(userAsigned);
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
        return  ticketMapper.toDto(ticket);
    }







}
