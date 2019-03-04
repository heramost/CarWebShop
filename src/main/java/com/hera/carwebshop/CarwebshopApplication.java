package com.hera.carwebshop;

import com.hera.carwebshop.data.DataSeeder;
import com.hera.carwebshop.repository.CarRepository;
import com.hera.carwebshop.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarwebshopApplication {
	//@Autowired DataSeeder dataSeeder;

	public static void main(String[] args) {
		SpringApplication.run(CarwebshopApplication.class, args);
	}
}
