package com.springbootticketingsystem.controller;

import com.springbootticketingsystem.dto.ticket.TicketRequestDTO;
import com.springbootticketingsystem.dto.ticket.TicketResponseDTO;
import com.springbootticketingsystem.service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Ticket")
class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    //POST
    @PostMapping
    public ResponseEntity<TicketResponseDTO> createTicket(@RequestBody TicketRequestDTO ticketDTO) {

        TicketResponseDTO dto = ticketService.createTicket(ticketDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }
    
    //GET
    @GetMapping("/{id}")
    public ResponseEntity<TicketResponseDTO> getTicketById(@PathVariable Long id) {
        
        TicketResponseDTO dto = ticketService.getTicketById(id);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    @GetMapping
    public ResponseEntity<TicketResponseDTO> getTicketByCode(@RequestParam String code) {

        TicketResponseDTO dto = ticketService.getTicketByCode(code);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }
    




}
