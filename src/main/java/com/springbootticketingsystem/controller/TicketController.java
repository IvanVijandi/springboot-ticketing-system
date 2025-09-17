package com.springbootticketingsystem.controller;

import com.springbootticketingsystem.dto.ticket.TicketRequestDTO;
import com.springbootticketingsystem.dto.ticket.TicketResponseDTO;
import com.springbootticketingsystem.service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/Ticket")
class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public ResponseEntity<TicketResponseDTO> createTicket(@RequestBody TicketRequestDTO ticketDTO) {

        TicketResponseDTO dto = ticketService.createTicket(ticketDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }




}
