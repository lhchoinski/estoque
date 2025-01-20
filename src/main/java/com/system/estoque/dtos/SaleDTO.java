package com.system.estoque.dtos;

import com.system.estoque.dtos.entities.ItemDTO;
import com.system.estoque.dtos.entities.UserDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SaleDTO implements Serializable {

    private ItemDTO item;

    private UserDTO user;


}
