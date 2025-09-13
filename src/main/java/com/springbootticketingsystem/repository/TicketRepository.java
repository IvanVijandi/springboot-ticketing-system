package com.springbootticketingsystem.repository;
import com.springbootticketingsystem.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface TicketRepository extends JpaRepository<Ticket, Long> {
}
