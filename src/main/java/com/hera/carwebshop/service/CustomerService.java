package com.hera.carwebshop.service;

import com.hera.carwebshop.model.Customer;
import com.hera.carwebshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class CustomerService {
	@Autowired
	private CustomerRepository repository;

	public Customer save(Customer customer) {
		return repository.save(customer);
	}

	public Iterable<Customer> saveAll(Iterable<Customer> customers) {
		return repository.saveAll(customers);
	}
}
