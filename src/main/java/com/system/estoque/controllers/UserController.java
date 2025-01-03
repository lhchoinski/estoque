package com.system.estoque.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import com.system.estoque.dtos.UserDTO;
import com.system.estoque.dtos.groups.AppGroup;
import com.system.estoque.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @PostMapping("/users")
    @JsonView({AppGroup.Response.class})
    public ResponseEntity<UserDTO> saveUser(
            @RequestBody
            @Validated(AppGroup.Request.class)
            @JsonView(AppGroup.Request.class)
            UserDTO userDto
    ) {

        return ResponseEntity.ok(userService.create(userDto));
    }

}