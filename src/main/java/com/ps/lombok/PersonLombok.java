package com.ps.lombok;

import java.time.LocalDate;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PersonLombok {
	@NonNull
	String firstName;
	String lastName;
	LocalDate dateOfBirth;

	public static void main(String[] args) {
		var date = LocalDate.now();
		var person = new PersonLombok("Prem", "Kumar", date);
		System.out.println(person.getFirstName());
		person.setFirstName("Rohan");
		System.out.println(person.getFirstName());
		System.out.println(person.equals(new PersonLombok("Rohan", "Kumar", date)));// true
		new PersonLombok(null, "Kumar", LocalDate.now());
	}
}
