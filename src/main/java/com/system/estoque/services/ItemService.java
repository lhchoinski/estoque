package com.system.estoque.services;

import com.system.estoque.dtos.ItemDTO;
import com.system.estoque.dtos.PageDTO;
import org.springframework.data.domain.Pageable;

public interface ItemService {

    ItemDTO create(ItemDTO item);

    PageDTO<ItemDTO> findAll(String search, Pageable pageable);

    ItemDTO findById(Long id);

    ItemDTO update(ItemDTO item);

    void delete(Long id);

    void enable(Long id);

    void disable(Long id);

}
