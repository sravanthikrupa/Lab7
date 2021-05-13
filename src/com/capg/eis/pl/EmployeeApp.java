package com.capg.eis.pl;

import com.capg.eis.bean.*;
import com.capg.eis.service.*;

public class EmployeeApp {

	public EmployeeApp() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		EmployeeServiceClass employeeService = new EmployeeServiceClass();
		employeeService.getDetailsAndFindSchema();
	}

}

