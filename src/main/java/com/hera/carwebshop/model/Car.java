package com.hera.carwebshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private Long id;

	@Column(name = "brand", nullable = false)
	private String brand;

	@Column(name = "type", nullable = false)
	private String type;

	@Column(name = "zero_to_sixty")
	private double zeroToSixty;

	@Column(name = "has_ac")
	private boolean hasAC;

	@Column(name = "date_of_manufacture", nullable = false)
	private LocalDate dateOfManufacture;

	public Car() {
	}

	public Car(String brand, String type, LocalDate dateOfManufacture) {
		this.brand = brand;
		this.type = type;
		this.dateOfManufacture = dateOfManufacture;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(LocalDate dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public double getZeroToSixty() {
		return zeroToSixty;
	}

	public void setZeroToSixty(double zeroToSixty) {
		this.zeroToSixty = zeroToSixty;
	}

	public boolean isHasAC() {
		return hasAC;
	}

	public void setHasAC(boolean hasAC) {
		this.hasAC = hasAC;
	}
}
