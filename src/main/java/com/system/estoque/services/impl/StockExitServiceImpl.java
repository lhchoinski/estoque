package com.system.estoque.services.impl;

import com.system.estoque.dtos.PageDTO;
import com.system.estoque.dtos.entities.StockExitDTO;
import com.system.estoque.entities.Item;
import com.system.estoque.entities.StockExit;
import com.system.estoque.entities.User;
import com.system.estoque.exeptions.BadRequestException;
import com.system.estoque.exeptions.NotFoundException;
import com.system.estoque.mappers.StockExitMapper;
import com.system.estoque.repositories.ItemRepository;
import com.system.estoque.repositories.StockExitRepository;
import com.system.estoque.repositories.UserRepository;
import com.system.estoque.services.StockExitService;
import com.system.estoque.services.specification.StockExitSpecification;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StockExitServiceImpl implements StockExitService {

    private final StockExitRepository stockExitRepository;
    private final StockExitMapper stockExitMapper;
    private final ItemRepository itemRepository;
    private final UserRepository userRepository;

    @Override
    public PageDTO<StockExitDTO> findAll(String search, Pageable pageable) {
        Specification<StockExit> spec = Specification.where(StockExitSpecification.isNotDeleted())
                .and(StockExitSpecification.hasNameContaining(search));

        Page<StockExit> stockExitPage = stockExitRepository.findAll(spec, pageable);

        List<StockExitDTO> stockExitDTOs = stockExitMapper.toStockExitDTOs(stockExitPage.getContent());

        return new PageDTO<>(
                stockExitDTOs,
                stockExitPage.getTotalPages(),
                stockExitPage.getTotalElements(),
                stockExitPage.getNumber(),
                stockExitPage.getSize()
        );
    }

    @Override
    @Transactional
    public StockExitDTO create(StockExitDTO stockExitDTO) {

        User user = getUser(stockExitDTO.getUserId());
        Item item = getItem(stockExitDTO.getItemId());

        StockExit stockExit = stockExitMapper.toEntity(stockExitDTO);

        stockExit.setItem(item);
        stockExit.setUser(user);
        stockExit.setQuantity(stockExitDTO.getQuantity());
        stockExit.setObservation("aaa");

        if (item.getQuantity() <= 0) {
            throw new BadRequestException("There are no items in stock");
        }

        if (stockExitDTO.getQuantity() > item.getQuantity()) {
            throw new BadRequestException("Quantity is not sufficient in stock");
        }

        Long updateQuantity = item.getQuantity() - stockExit.getQuantity();

        item.setQuantity(updateQuantity);
        stockExit.setDate_exit(LocalDateTime.now());

        stockExitRepository.save(stockExit);

        return stockExitMapper.toDto(stockExit);
    }

    @Override
    public StockExitDTO findById(Long id) {
        StockExit stockExit = getStockExit(id);
        return stockExitMapper.toDto(stockExit);
    }

    @Override
    @Transactional
    public StockExitDTO update(StockExitDTO stockExitDTO) {
        StockExit stockExit = getStockExit(stockExitDTO.getId());

        stockExit.setQuantity(stockExitDTO.getQuantity());
        stockExit.setItem(getItem(stockExitDTO.getItemId()));
        stockExit.setUser(getUser(stockExitDTO.getUserId()));

        stockExitRepository.save(stockExit);

        return stockExitMapper.toDto(stockExit);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        StockExit stockExit = getStockExit(id);

        stockExit.setDeletedAt(LocalDateTime.now());

        stockExitRepository.save(stockExit);
    }

    private StockExit getStockExit(Long id) throws NotFoundException {
        return stockExitRepository.findByIdAndDeletedAtIsNull(id).orElseThrow(()
                -> new NotFoundException("StockExit not found"));
    }

    private User getUser(UUID id) throws NotFoundException {
        return userRepository.findByIdAndDeletedAtIsNull(id).orElseThrow(()
                -> new NotFoundException("User not found"));
    }

    private Item getItem(Long id) throws NotFoundException {
        return itemRepository.findByIdAndDeletedAtIsNull(id).orElseThrow(()
                -> new NotFoundException("Item not found"));
    }
}
