package com.ahmed.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ahmed.entities.Car;

public interface CarRepository extends JpaRepository<Car,String>{
	@Query("Select c from Car c where c.matriculation like :x")
	public Page<Car> findCar(@Param("x") String mat, Pageable pageable);

}
