package com.system.estoque.dtos;

import com.system.estoque.dtos.entities.ItemDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SaleItemDTO implements Serializable {

    private Long id;

    private ItemDTO item;

    private Long itemId;

    private Long quantity;

    private Double pricePartial;

    private SaleDTO sale;

}
