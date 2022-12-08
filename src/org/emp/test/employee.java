package org.emp.test;

public class employee {

	public void employeeId() {
		System.out.println("Employee Id is : 1234");

	}
	
	public void employeeId(int id) {
		System.out.println("Employee id is :"+id);

	}
	public static void main(String[] args) {
		employee e=new employee();
		e.employeeId();
		e.employeeId(1234);
		
		
	}
	
}
