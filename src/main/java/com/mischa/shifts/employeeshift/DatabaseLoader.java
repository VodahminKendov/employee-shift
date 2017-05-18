package com.mischa.shifts.employeeshift;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final EmployeeRepository repository;

	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Employee("Mischa", "Hedington", "Thursday/Friday/Saturday", "Night"));
		this.repository.save(new Employee("John", "Smith", "Thursday/Friday/Saturday", "Day"));
		this.repository.save(new Employee("Jane", "Roe", "Thursday/Friday/Saturday", "Morning"));
		this.repository.save(new Employee("John", "Doe", "Tuesday/Wednesday", "Night"));
		this.repository.save(new Employee("Jane", "Doe", "Monday", "Day"));
		this.repository.save(new Employee("John", "Roe", "Monday/Thursday/Friday/Saturday", "Morning"));
	}
}