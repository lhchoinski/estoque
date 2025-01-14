package com.system.estoque.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import com.system.estoque.dtos.ItemDTO;
import com.system.estoque.dtos.PageDTO;
import com.system.estoque.dtos.groups.AppGroup;
import com.system.estoque.services.ItemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/item")
@RequiredArgsConstructor
@Tag(name = "Item")
public class ItemController {

    private final ItemService itemService;

    @GetMapping
    public PageDTO<ItemDTO> findAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(required = false) String search
    ) {
        Pageable pageable = PageRequest.of(page, size);
        return itemService.findAll(search, pageable);
    }

    @Operation(summary = "Create", description = "Create item")
    @PostMapping
    public ResponseEntity<ItemDTO> create(
            @RequestBody
            @Valid
            @JsonView(AppGroup.Request.class)
            ItemDTO itemDTO
    ) {

        return ResponseEntity.ok(itemService.create(itemDTO));
    }

    @Operation(summary = "Delete", description = "Delete item")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        itemService.delete(id);

        return ResponseEntity.ok().build();
    }
}
