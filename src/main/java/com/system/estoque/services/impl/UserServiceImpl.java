package com.system.estoque.services.impl;

import com.system.estoque.dtos.UserDTO;
import com.system.estoque.entities.User;
import com.system.estoque.mappers.UserMapper;
import com.system.estoque.producers.UserProducer;
import com.system.estoque.repositories.UserRepository;
import com.system.estoque.services.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserProducer userProducer;
    private final UserMapper userMapper;

    @Transactional
    public UserDTO create(UserDTO userDTO) {

        userDTO.setName(userDTO.getName().toUpperCase());

//        String encryptedPassword = new BCryptPasswordEncoder().encode(userDTO.getPassword());
//        user.setPassword(encryptedPassword);

        User user = userMapper.toEntity(userDTO);

        userRepository.save(user);

        userProducer.publishMessageEmail(user);

        return userMapper.toDto(user);
    }
}
