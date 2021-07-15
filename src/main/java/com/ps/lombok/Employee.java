package com.ps.lombok;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Builder @Data
public class Employee {
	String firstName;
	String lastName;
	LocalDate dateOfBirth;

	public static void main(String[] args) {
		Employee emp = new EmployeeBuilder().firstName("Rakesh")
				.lastName("Kumar")
				.dateOfBirth(LocalDate.now())
				.build();
		System.out.println(emp);
	}
}
