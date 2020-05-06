package com.jobs.domain;

public class IPaymentRate {
	private double rate;
	
	public IPaymentRate(double rate) {
		this.rate = rate;
	}
	
	public double pay(double salaryPerMonth) {
		
			return salaryPerMonth*this.rate;
	}
}
