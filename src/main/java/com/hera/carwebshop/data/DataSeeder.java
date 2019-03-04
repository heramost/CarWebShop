package com.hera.carwebshop.data;

import com.hera.carwebshop.model.Car;
import com.hera.carwebshop.model.Customer;
import com.hera.carwebshop.model.Stock;
import com.hera.carwebshop.service.CarService;
import com.hera.carwebshop.service.CustomerService;
import com.hera.carwebshop.service.DealService;
import com.hera.carwebshop.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Component
public class DataSeeder {
	@Autowired CarService carService;
	@Autowired CustomerService customerService;
	@Autowired DealService dealService;
	@Autowired StockService stockService;

	@PostConstruct
	public void createSeedDataIfNeeded() {
		if (!carService.findAll().iterator().hasNext()) {
			Car bmw = new Car("Bmw", "328i", LocalDate.of(1991, 1, 1));
			bmw.setZeroToSixty(7.6);
			Car ford = new Car("Ford", "fiesta", LocalDate.of(2005, 1, 1));
			ford.setZeroToSixty(14);
			ford.setHasAC(true);
			carService.save(bmw);
			carService.save(ford);

			Customer me = new Customer("Héra Zoltán", "nulllllll");
			Customer mother = new Customer("Radics Mária", "nulllllll");

			customerService.save(me);
			customerService.save(mother);

			Stock fords = new Stock(ford, 1214, 2500000);
			Stock bmws = new Stock(bmw, 1, 1000000);

			stockService.save(fords);
			stockService.save(bmws);
		}
	}
}
