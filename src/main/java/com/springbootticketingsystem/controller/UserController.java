package com.springbootticketingsystem.controller;

import com.springbootticketingsystem.dto.user.UserRequestDTO;
import com.springbootticketingsystem.dto.user.UserResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.springbootticketingsystem.service.*;
import org.springframework.web.service.annotation.GetExchange;


@RestController
@RequestMapping("/users")
class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO userDTO) {

        UserResponseDTO userCreatedDto = userService.createUser(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreatedDto);
    }

    //GET USERS
    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getUserById(@PathVariable Long id) {
        UserResponseDTO userFoundDto = userService.getUserById(id);
        return ResponseEntity.ok(userFoundDto);
    }

    @GetMapping
    public ResponseEntity<UserResponseDTO> getUserByEmail(@RequestParam String email) { //Email como request param, ya path variable solo para id
        UserResponseDTO userDto = userService.getUserByEmail(email);
        return ResponseEntity.ok(userDto);
    }

    //PUT
    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDTO> modifyUser(@PathVariable Long id, @RequestBody UserRequestDTO userDTO) {

        UserResponseDTO userModificationDTO = userService.updateUser(userDTO, id);
        return ResponseEntity.ok(userModificationDTO);
    }

    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<UserResponseDTO> deleteUser(@PathVariable Long id) {
        UserResponseDTO user_deletedDTO = userService.deleteUser(id);
        return ResponseEntity.ok(user_deletedDTO);
    }


}
