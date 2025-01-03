package com.system.estoque.services;

import com.system.estoque.dtos.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDTO create(UserDTO userDTO);
}
