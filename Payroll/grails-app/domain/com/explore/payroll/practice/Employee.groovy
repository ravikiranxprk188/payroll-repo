package com.explore.payroll.practice

class Employee {

	Long employeeId;
	String firstName;
	String lastName;
	Date dateOfBirth;
	Date dateOfJoining;
	String department;
	
    static constraints = {
		employeeId(nullable: false, unique:true)
		firstName (blank: false)
		lastName (blank: false)
		dateOfBirth (blank: false, nullable: false)
		dateOfJoining (blank: false,nullable: false)
    }
}
