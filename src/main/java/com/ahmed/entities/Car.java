package com.ahmed.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Car implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String matriculation;
	private String color;
	private String brand;
	private Float price;
	@ManyToOne
	private Agency agency;

	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Car(String matriculation, String color, String brand, Float price, Agency agency) {
		super();
		this.matriculation = matriculation;
		this.color = color;
		this.brand = brand;
		this.price = price;
		this.agency = agency;
	}


	public String getMatriculation() {
		return matriculation;
	}
	public void setMatriculation(String matriculation) {
		this.matriculation = matriculation;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}

	public Agency getAgency() {
		return agency;
	}
	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	
	
}
