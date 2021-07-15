package com.ps.lombok;

import java.time.LocalDate;
import java.util.Optional;

import javax.management.ConstructorParameters;

import lombok.*;
import lombok.experimental.*;

@Getter
@Setter @NoArgsConstructor
@AllArgsConstructor(onConstructor_ = @ConstructorParameters({ "id", "email" }))
public class User {

	@Setter(AccessLevel.PRIVATE)
	private Long id;

	// @Getter(AccessLevel.PROTECTED)
	@Accessors(fluent = true)
	private String username;

	// @Getter(AccessLevel.PACKAGE)
	private String email;

	@Getter(AccessLevel.PUBLIC)
	@Setter(AccessLevel.PRIVATE)
	private LocalDate lastUpdated;
	
	@Getter(onMethod_ = @Deprecated) // JDK8
	@Setter(onParam_ = @NonFinal)
	private Character sex;
	
	
	@Getter(onMethod_= {
		      @Deprecated})
	private Boolean active;

	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}

	public static void main(String[] args) {
		User user = new User();
		System.out.println(user == user.username(null));
	}
}
