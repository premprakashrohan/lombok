package com.ps.lombok;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;

@Builder
@Data
public class Employee {
	String firstName;
	String lastName;
	LocalDate dateOfBirth;
	private Long id;
	@Default
	private String name = "anonymous";

	private boolean active;

	private int role;

	private double salary;

	@Default
	private int defaultRole = 3;

	public static void main(String[] args) {
		Employee emp = new EmployeeBuilder().firstName("Rakesh").lastName("Kumar").dateOfBirth(LocalDate.now()).build();
		System.out.println(emp);
	}
}
