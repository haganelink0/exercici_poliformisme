package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	private String description;

	public Volunteer(String name, String address, String phone) throws Exception {
		super(name, address, phone);
	}

	
	@Override
	public void pay() {
		this.description = name + " doesn't get paid.";
		
	}


	@Override
	public String toString() {
		return "Employee number: " + id + ", name: " + name + ",\n Address: " + address + ". \n Phone: " + phone 
				+ ". \n Salary: " + description;
	}
	
	

}
