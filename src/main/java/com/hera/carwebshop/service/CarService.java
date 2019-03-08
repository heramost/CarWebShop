package com.hera.carwebshop.service;

import com.hera.carwebshop.model.Car;
import com.hera.carwebshop.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class CarService {
	@Autowired
	private CarRepository repository;

	public Car save(Car car) {
		return repository.save(car);
	}

	public Car get(long id) {
		return repository.findById(id).orElse(null);
	}

	public Iterable<Car> findAll() {
		return repository.findAll();
	}
}
