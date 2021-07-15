package com.ps.lombok;

import java.time.LocalDate;
import java.util.Optional;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

	@Setter(AccessLevel.PRIVATE)
	private Long id;

	@Getter(AccessLevel.PROTECTED)
	private String username;

	//@Getter(AccessLevel.PACKAGE)
	private String email;

	@Getter(AccessLevel.PUBLIC)
	@Setter(AccessLevel.PRIVATE)
	private LocalDate lastUpdated;
	
	public Optional<String> getEmail() {
	    return Optional.ofNullable(email);
	  }

}
 