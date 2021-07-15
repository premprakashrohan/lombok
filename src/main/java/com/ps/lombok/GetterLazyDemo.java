package com.ps.lombok;

import lombok.Getter;

public class GetterLazyDemo {

	public static void main(String[] args) {

		Payment payment = new Payment();

		System.out.println("Eager getters called at instance creation time!");
		double sc = payment.getSurCharge();
/*
 * private final java.util.concurrent.atomic.AtomicReference<Object> surCharge = new java.util.concurrent.atomic.AtomicReference<Object>();

 * public double getSurCharge() {
    Object value = this.surCharge.get();
    if (value == null) {
      synchronized (this.surCharge) {
        value = this.surCharge.get();
        if (value == null) {
          final double actualValue = complexSurchargeLogic();
          value = actualValue;
          this.surCharge.set(value);
        }
      }
    }
    return (Double) value;
  }
 * 
 * */
	}
}

class Payment {

	@Getter
	private Long id;

	@Getter
	private String status = simpleDefaultStatus();

	@Getter(lazy = true)
	private final double surCharge = complexSurchargeLogic();

	private double complexSurchargeLogic() {

		Double surcharge = Math.PI;
		System.out.println("Called Lazy getSurcharge method");

		return surcharge;
	}

	private String simpleDefaultStatus() {
		System.out.println("Called EAGER getStatus method");
		return "NOT_INITIALIZED";
	}
}