package com.system.estoque.services.impl;

import com.system.estoque.entities.User;
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

    @Transactional
    public User create(User user) {
        user = userRepository.save(user);
        userProducer.publishMessageEmail(user);
        return user;
    }
}
