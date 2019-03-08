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
@Table(name = "stock")
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name="car_id", nullable=false)
	private Car car;

	@Column(name = "stock", nullable = false)
	private int stock;

	@Column(name = "price", nullable = false)
	private int price;

	@Column(name = "date_of_last_change", nullable = false)
	private LocalDateTime dateOfLastChange = LocalDateTime.now();

	public Stock() {

	}

	public Stock(Car car, int stock, int price) {
		this.car = car;
		this.stock = stock;
		this.price = price;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDateOfLastChange(LocalDateTime dateOfLastChange) {
		this.dateOfLastChange = dateOfLastChange;
	}

	public LocalDateTime getDateOfLastChange() {
		return dateOfLastChange;
	}
}
