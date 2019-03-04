package com.hera.carwebshop.repository;

import com.hera.carwebshop.model.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock, Long> {
}
