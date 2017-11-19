package com.ahmed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ahmed.dao.AgencyRepository;
import com.ahmed.dao.CarRepository;
import com.ahmed.entities.Agency;
import com.ahmed.entities.Car;

@SpringBootApplication
@EntityScan("com.ahmed.entities")
@EnableJpaRepositories("com.ahmed.dao")
public class RentcarApplication implements CommandLineRunner {
 	@Autowired
 	private CarRepository carRepository;
 	@Autowired
 	private AgencyRepository agencyRepository;
 	
 	
	public static void main(String[] args) {
		SpringApplication.run(RentcarApplication.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {
		
		agencyRepository.save(new Agency("My Car", "Tunis", 632145666));
		agencyRepository.save(new Agency("Luxe Car", "Sfax", 985633778));
		agencyRepository.findAll().forEach(c->{System.out.println(c.getName());});
		Agency agency =agencyRepository.findOne((long) 1);
		carRepository.save(new Car("123Tu456", "Red", "BMW",  12.365f, agency));
		System.out.println(carRepository.findCar("123Tu456", new PageRequest(5, 10)).getContent());
	
	}
}
