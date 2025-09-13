package com.springbootticketingsystem.repositories;
import com.springbootticketingsystem.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface TicketRepository extends JpaRepository<Ticket, Long> {
}
