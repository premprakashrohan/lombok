package com.ps.lombok;

import java.util.List;
import java.util.Map;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

@Builder(builderClassName = "Builder")
@Getter
@ToString
public class LombokSingularDemo {
	private Long id;
	@Singular
	private List<String> names;

	@Singular
	private Map<Integer, String> students;

	@Singular("singleAircraft")
	private List<String> aircraft;

	public static void main(String[] args) {

		LombokSingularDemo lsd1 = LombokSingularDemo.builder().id(Long.valueOf(1)).name("Krish")
				.names(List.of("Prem", "Rohan")).student(1, "Peter").student(2, "Martin")
				.students(Map.of(3, "Philip", 4, "Gerhard")).students(Map.of(5, "Alisa")).singleAircraft("Boeing XP-15")
				.singleAircraft("Avro 527").aircraft(List.of("Sukhoi Su 47", "Supermarine 535")).build();

		System.out.println(lsd1);

		LombokSingularDemo lsd2 = lsd1.builder().clearNames().build();
		System.out.println(lsd1);
		System.out.println(lsd2);
	}
}