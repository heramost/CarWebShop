package com.hera.carwebshop.service;

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

	public Deal save(Deal deal) {
		return repository.save(deal);
	}

	public Iterable<Deal> saveAll(Iterable<Deal> deals) {
		return repository.saveAll(deals);
	}
}
