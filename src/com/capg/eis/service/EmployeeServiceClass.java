package com.capg.eis.service;

import com.capg.eis.bean.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class EmployeeServiceClass extends Employee implements EmployeeService{

	public void getDetailsAndFindSchema() {
		// TODO Auto-generated method stub
		HashSet localHashSet = new HashSet();
	    localHashSet.add(new Employee(1,"Ram",34000,"Programmer"));
	    localHashSet.add(new Employee(2,"Komal",5000,"Clerk"));
	    localHashSet.add(new Employee(3,"Hari",6000,"System Associate"));
	    Employee e1 = new Employee(4,"Srinjana",15000,"System Associate");
	    localHashSet.add(e1);
	    localHashSet.add(new Employee(5,"Anshu",4500,"Clerk"));
	    localHashSet.add(new Employee(6,"Stuti",60000,"Manager"));
	    //removing 
	    localHashSet.remove(e1);
	    
	    Map<String,HashSet<Employee>> deviceMap = new HashMap<String, HashSet<Employee>>();
	    deviceMap.put("Employee", localHashSet);
	    Iterator<String> itr = deviceMap.keySet().iterator();
		
		while(itr.hasNext())
		{
			String keyName = itr.next();
			HashSet<Employee> list = deviceMap.get(keyName);
			
			System.out.println("============="+" Device Information :- "+keyName+"=============");
			
			for (Employee emp : list) {
				try {
					//throwing exception
				if(emp.getSalary()<2000)
				throw new InvalidInputException("Exception");
				else
				{
					if(emp.getSalary()>5000 && emp.getSalary()<20000)
						emp.setInsuranceScheme("Schema C");
					else if(emp.getSalary()>=20000 && emp.getSalary()<40000)
						emp.setInsuranceScheme("Schema B");
					else if(emp.getSalary()>=40000)
						emp.setInsuranceScheme("Schema A");
					else
						emp.setInsuranceScheme("No Schema");
					//Printing the final data
					System.out.println(emp.toString());
				}
				
			}
				catch(InvalidInputException e)
				{
					System.out.println("Caught exception- Salary more than 2000");
				}
			}
		}
	}
}
