package com.hera.carwebshop.service;

import com.hera.carwebshop.model.Stock;
import com.hera.carwebshop.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class StockService {
	@Autowired
	private StockRepository repository;

	public Stock save(Stock stock) {
		return repository.save(stock);
	}

	public Iterable<Stock> saveAll(Iterable<Stock> stocks) {
		return repository.saveAll(stocks);
	}
}
