package com.mischa.shifts.employeeshift;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String days;
	private String shift;

	private Employee() {}

	public Employee(String firstName, String lastName, String days, String shift) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.days = days;
		this.shift = shift;
	}
}