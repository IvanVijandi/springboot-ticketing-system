package com.springbootticketingsystem.repositories;

import com.springbootticketingsystem.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

interface CommentRepository extends JpaRepository<Comment, Long> {
}
