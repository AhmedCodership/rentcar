package com.ahmed.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Agency implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private long agencyId ;
	private String name;
	private String address;
	private long tel;
	
	public Agency( String name, String address, long tel) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@OneToMany(mappedBy = "agency", cascade = CascadeType.PERSIST)
	private List<Car> cars;
	
	
	public Agency() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	public long getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(long agencyId) {
		this.agencyId = agencyId;
	}
	
	
}
