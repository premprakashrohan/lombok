package com.ps.lombok;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class PersonLombok {
	@NonNull String firstName;
	String lastName;
	LocalDate dateOfBirth;
	public static void main(String[] args) {
	var person =	new PersonLombok("Prem", "Kumar", LocalDate.now());
	System.out.println(person.getFirstName());
	person.setFirstName("Rohan");
	System.out.println(person.getFirstName());
	 new PersonLombok(null, "Kumar", LocalDate.now());
	}
}
