package com.hera.carwebshop.controllers;

import com.hera.carwebshop.model.Car;
import com.hera.carwebshop.model.Stock;
import com.hera.carwebshop.service.CarService;
import com.hera.carwebshop.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
public class ShoppingControllerREST {
	@Autowired
	CarService carService;
	@Autowired
	StockService stockService;

	@GetMapping("/cars")
	public Iterable<Car> getCars() {
		return carService.findAll();
	}

	@GetMapping("/stocks")
	public Iterable<Stock> getStocks() {
		return stockService.findAll();
	}
}
