package com.Xworz.Interrface.app.company;

public class EmployeeRule implements CompanyRule {
	
	public void getOne() {
		System.out.println("Corporate employee should be loyal");
	} 
	
	public void getTwo() {
		System.out.println("You should not disclose your role");
	}

}
