package com.system.estoque.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    @Column(name = "user_name")
    private String userName;

    private String email;

    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String cpf;

    private Boolean active;


}
