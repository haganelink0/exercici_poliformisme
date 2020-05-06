package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;
	
	public JobsController(){
		this.repository = new EmployeeRepository();
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
	}


	public void payAllEmployeers() {
		for (AbsStaffMember e : repository.getAllMembers()) {
			e.pay();
		}
	}

	public String getAllEmployees() {
		String result = "";
		for (AbsStaffMember e : repository.getAllMembers()) {
			result += e.toString() + "\n \n";
		}
		return result;
	}

	public void createVolunteer(String name, String address, String phone) throws Exception {
		Volunteer volunteer = new Volunteer(name, address, phone);
		repository.addMember(volunteer);
		
	}
	
	
	
}
