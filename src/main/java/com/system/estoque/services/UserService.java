package com.system.estoque.services;

import com.system.estoque.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User create(User user);
}
