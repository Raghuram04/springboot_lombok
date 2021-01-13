package com.weblearner.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.weblearner.springboot.model.Employee;

@SpringBootApplication
public class SpringbootRestfulserviceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// No Argument Constructor
		Employee employee1 = new Employee();

		// Argument Contructor
		Employee employee2 = new Employee("123", "Sam", "IT");

		// setter method

		employee1.setEmpId("456");
		employee1.setEmpName("Tom");
		employee1.setDeptName("CSE");

		// getter method
		System.out.println("Getter method example ->" + employee1.getEmpId() + " -- " + employee1.getEmpName() + " -- "
				+ employee1.getDeptName());

		// toString method

		System.out.println("toString() -->" + employee2.toString());

	}

}
