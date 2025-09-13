package com.springbootticketingsystem.repository;
import com.springbootticketingsystem.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CommentRepository extends JpaRepository<Comment, Long> {
}
