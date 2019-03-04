package com.hera.carwebshop.repository;

import com.hera.carwebshop.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
