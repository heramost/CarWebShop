package com.hera.carwebshop.service;

import com.hera.carwebshop.endpoints.SellCarsRequest;
import com.hera.carwebshop.model.Customer;
import com.hera.carwebshop.model.Deal;
import com.hera.carwebshop.repository.DealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class DealService {
	@Autowired
	private DealRepository repository;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private CarService carService;

	@Autowired
	private StockService stockService;

	public String createDeal(SellCarsRequest sellCarsRequest) {
		Customer customer = customerService.get(sellCarsRequest.getCutomerId());
		if (customer == null) {
			return "There are no Customer with id: " + sellCarsRequest.getCutomerId();
		}

		boolean success = stockService.buy(sellCarsRequest);
		if (success) {
			save(new Deal(carService.get(sellCarsRequest.getCarId()), customer, sellCarsRequest.getPrice(), sellCarsRequest.getAmount()));
			return "The order was successful";
		}
		else {
			return "We do not have " + sellCarsRequest.getAmount() + " car(s) available wih id: " + sellCarsRequest.getCarId() + ", on price " + sellCarsRequest.getPrice() + ".";
		}
	}

	public Deal save(Deal deal) {
		return repository.save(deal);
	}

	public Iterable<Deal> saveAll(Iterable<Deal> deals) {
		return repository.saveAll(deals);
	}
}
