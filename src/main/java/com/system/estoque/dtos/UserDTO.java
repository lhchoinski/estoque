package com.system.estoque.dtos;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class UserDTO implements Serializable {

    private String name;
    private String email;
}
