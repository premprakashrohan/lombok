package com.ps.lombok;

import java.util.List;

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

	public static void main(String[] args) {

		LombokSingularDemo lsd1 = LombokSingularDemo.builder().id(Long.valueOf(1)).name("Krish")
				.names(List.of("Prem", "Rohan")).build();

		System.out.println(lsd1);

		LombokSingularDemo lsd2 = lsd1.builder().clearNames().build();
		System.out.println(lsd1);
		System.out.println(lsd2);
	}
}