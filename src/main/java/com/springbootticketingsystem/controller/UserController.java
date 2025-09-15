package com.springbootticketingsystem.controller;

import com.springbootticketingsystem.dto.user.UserRequestDTO;
import com.springbootticketingsystem.dto.user.UserResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springbootticketingsystem.service.*;

@RestController
@RequestMapping("/user")
class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/createUser")
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO userDTO) {

        UserResponseDTO userCreatedDto = userService.createUser(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreatedDto);
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<UserResponseDTO> modifyUser(@PathVariable Long id, @RequestBody UserRequestDTO userDTO) {

        UserResponseDTO userModificationDTO = userService.updateUser(userDTO, id);
        return ResponseEntity.ok(userModificationDTO);
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<UserResponseDTO> deleteUser(@PathVariable Long id) {
        UserResponseDTO user_deletedDTO = userService.deleteUser(id);
        return ResponseEntity.ok(user_deletedDTO);
    }


}
