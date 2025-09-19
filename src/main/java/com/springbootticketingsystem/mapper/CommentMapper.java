package com.springbootticketingsystem.mapper;
import com.springbootticketingsystem.dto.comment.CommentResponseDTO;
import com.springbootticketingsystem.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    @Mapping(source = "ticket.code", target = "ticketCode")
    @Mapping(source = "author.name", target = "authorName")
    CommentResponseDTO toDto(Comment comment);
}
