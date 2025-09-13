package com.springbootticketingsystem.repositories;

import com.springbootticketingsystem.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

interface TicketRepository extends JpaRepository<Ticket, Long> {
}
