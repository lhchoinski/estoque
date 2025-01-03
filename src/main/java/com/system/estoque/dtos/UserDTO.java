package com.system.estoque.dtos;

import com.fasterxml.jackson.annotation.JsonView;
import com.system.estoque.dtos.groups.AppGroup;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Setter
@Getter
public class UserDTO implements Serializable {

    @JsonView({AppGroup.Response.class, AppGroup.ResponsePage.class})
    private UUID id;

    @JsonView({AppGroup.Response.class, AppGroup.ResponsePage.class, AppGroup.Request.class})
    @NotNull(message = "Preenchimento obrigatório")
    private String name;

    @JsonView({AppGroup.Response.class, AppGroup.ResponsePage.class, AppGroup.Request.class})
    @NotNull(message = "Preenchimento obrigatório")
    private String userName;

    @JsonView({AppGroup.Response.class, AppGroup.ResponsePage.class, AppGroup.Request.class})
    @NotNull(message = "Preenchimento obrigatório")
    private String email;

    @JsonView({AppGroup.Response.class, AppGroup.ResponsePage.class, AppGroup.Request.class})
    @NotNull(message = "Preenchimento obrigatório")
    private String password;

    @JsonView({AppGroup.Response.class, AppGroup.ResponsePage.class, AppGroup.Request.class})
    @NotNull(message = "Preenchimento obrigatório")
    private String cpf;

    @JsonView({AppGroup.Response.class, AppGroup.ResponsePage.class, AppGroup.Request.class})
    private String phoneNumber;
}
