package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	
	public static IPaymentRate createPaymentRateBoss(){
		double rate = 1.5;
		return new IPaymentRate(rate);
	}
	
	public static IPaymentRate createPaymentRateManager() {
		double rate = 1.1;
		return new IPaymentRate(rate);
	}
	
	public static IPaymentRate createPaymentRateEmployee(){
		double rate = 0.85;
		return new IPaymentRate(rate);
	}
}
