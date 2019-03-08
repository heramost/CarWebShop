package com.hera.carwebshop.service;

import com.hera.carwebshop.endpoints.SellCarsRequest;
import com.hera.carwebshop.model.Stock;
import com.hera.carwebshop.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.time.LocalDateTime.now;
import static java.util.Comparator.comparing;

@Service
@Validated
public class StockService {
	@Autowired
	private StockRepository repository;

	@Autowired
	private CarService carService;

	public Stock save(Stock stock) {
		return repository.save(stock);
	}

	private Iterable<Stock> findAllByCar(long carId) {
		return repository.findAllByCarId(carId);
	}

	public boolean buy(SellCarsRequest sellCarsRequest) {
		List<Stock> stocks = new ArrayList<>();
		findAllByCar(sellCarsRequest.getCarId()).forEach(stocks::add);
		Optional<Stock> bestStock = stocks.stream()
						.filter(stock -> stock.getPrice() <= sellCarsRequest.getPrice() && stock.getStock() >= sellCarsRequest.getAmount())
						.min(comparing(Stock::getPrice));

		bestStock.ifPresent(stock -> {
			stock.setDateOfLastChange(now());
			stock.setStock(stock.getStock() - sellCarsRequest.getAmount());
			save(stock);
		});

		return bestStock.isPresent();
	}

	public Iterable<Stock> findAll() {
		return repository.findAll();
	}
}
