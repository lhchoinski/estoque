package com.system.estoque.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "stock_entries")
public class StockEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Item item;

    @Column(name = "item_id")
    private Long itemId;

    @ManyToOne
    @JoinColumn(name = "supplier_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Supplier supplier;

    @Column(name = "supplier_id")
    private Long supplierId;

    private Long quantity;

    private LocalDateTime date_entry;

}

