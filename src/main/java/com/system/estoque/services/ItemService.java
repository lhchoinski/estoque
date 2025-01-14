package com.system.estoque.services;

import com.system.estoque.dtos.ItemDTO;
import com.system.estoque.dtos.PageDTO;
import com.system.estoque.entities.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ItemService {

    ItemDTO create(ItemDTO item);

    PageDTO<ItemDTO> findAll(String search, Pageable pageable);

    ItemDTO findById(Long id);

    ItemDTO update(Long id, ItemDTO item);

    void delete(Long id);

}
