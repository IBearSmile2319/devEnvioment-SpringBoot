package com.programingtechie.inventoryservice.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.programingtechie.inventoryservice.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    // Optional<Inventory> findBySkuCode();
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
    
}
