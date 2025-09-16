package com.springbootticketingsystem.service;
import com.springbootticketingsystem.dto.user.UserResponseDTO;
import com.springbootticketingsystem.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.springbootticketingsystem.model.User;
import com.springbootticketingsystem.dto.user.UserRequestDTO;
import com.springbootticketingsystem.mapper.UserMapper;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.userMapper = new UserMapper();

    }

    //CREAR USUARIO
    public UserResponseDTO createUser(UserRequestDTO dto){

        User user = userMapper.toEntity(dto);
        User user_created = userRepository.save(user);
        return userMapper.toResponseDto(user_created);


    }

    //OBTENER USUARIOS
    public UserResponseDTO getUserById(Long id){

       User user = userRepository.findById(id)
               .orElseThrow(()-> new RuntimeException("User not found"));

        return userMapper.toResponseDto(user);

    }

    public UserResponseDTO getUserByEmail(String email){

        User user = userRepository.getUserByEmail(email);
        if (user == null){
            throw new RuntimeException("User not found");
        }
        return userMapper.toResponseDto(user);

    }

    //UPDATE
    public UserResponseDTO updateUser(UserRequestDTO user_Dto, Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found")); // ()->funcion anonima que se pasa como parametro

        user.setEmail(user_Dto.getEmail());
        user.setName(user_Dto.getName());
        user.setSurname(user_Dto.getSurname());
        user.setRol(user_Dto.getRol());
        userRepository.save(user);
        return userMapper.toResponseDto(user);

    }

    //DELETE
    public UserResponseDTO deleteUser(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        userRepository.delete(user);
        return userMapper.toResponseDto(user);
    }

}
