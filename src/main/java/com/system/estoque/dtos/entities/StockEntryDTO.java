package com.system.estoque.dtos.entities;

import com.fasterxml.jackson.annotation.JsonView;
import com.system.estoque.dtos.groups.AppGroup;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class StockEntryDTO implements Serializable {

    @JsonView({AppGroup.Response.class, AppGroup.ResponsePage.class})
    private Long id;

    @JsonView({AppGroup.Response.class, AppGroup.ResponsePage.class})
    private ItemDTO item;

    @JsonView({AppGroup.Request.class})
    @NotNull(message = "{required_message}")
    private Long itemId;

    @JsonView({AppGroup.Response.class, AppGroup.ResponsePage.class})
    private SupplierDTO supplier;

    @JsonView({AppGroup.Request.class})
    @NotNull(message = "{required_message}")
    private Long supplierId;

    @JsonView({AppGroup.Response.class, AppGroup.ResponsePage.class, AppGroup.Request.class})
    @NotNull(message = "{required_message}")
    private Long quantity;
}
