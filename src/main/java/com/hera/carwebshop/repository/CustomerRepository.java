package com.hera.carwebshop.repository;

import com.hera.carwebshop.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
