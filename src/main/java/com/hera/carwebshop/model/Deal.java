package com.hera.carwebshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "deal")
public class Deal {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name="car_id", nullable=false)
	private Car car;

	@ManyToOne
	@JoinColumn(name="customer_id", nullable=false)
	private Customer customer;

	@Column(name = "price", nullable = false)
	private int price;

	@Column(name = "amount", nullable = false)
	private int amount;

	@Column(name = "date_of_deal", nullable = false)
	private LocalDateTime dateOfDeal = LocalDateTime.now();

	public Deal() {

	}

	public Deal(Car car, Customer customer, int price, int amount) {
		this.car = car;
		this.customer = customer;
		this.price = price;
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public LocalDateTime getDateOfDeal() {
		return dateOfDeal;
	}

	public void setDateOfDeal(LocalDateTime dateOfDeal) {
		this.dateOfDeal = dateOfDeal;
	}
}
