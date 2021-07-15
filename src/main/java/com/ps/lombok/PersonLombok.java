package com.ps.lombok;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class PersonLombok {
	@NonNull String firstName;
	String lastName;
	LocalDate dateOfBirth;
	public static void main(String[] args) {
		new PersonLombok(null, "Kumar", LocalDate.now());
	}
}
