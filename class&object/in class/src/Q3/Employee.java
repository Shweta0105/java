import java.util.*;
import java.io.*;

class Employee	{

	//class varaiable declaration
	String firstName;
	String lastName;
	Double monthlySalary;
	Scanner input = new Scanner(System.in);
		
	//Constructor declaration
	Employee()	{
		firstName = "";
		lastName = "";
		monthlySalary = 0.0;
	}

	//Parameterized Constructor declaration
	Employee(String firstName,String lastName, Double monthlySalary)	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}

	//get method for getting the user values
	String getFirstName()	{
		return firstName;
	}

	String getLastName(){
		return lastName;
	}

	Double getMonthlySalary() {
		return monthlySalary;
	}

	//set mothods to set the user given value
	void setFirstName(String firstName){
		this.firstName = firstName;
	}

	void setLastName(String lastName){
		this.lastName = lastName;
	}

	void setMonthlySalary(Double monthlySalary){
		if (monthlySalary > 0.0){
			this.monthlySalary = monthlySalary;
		}
	}
	
	//method to evaluate yearly salary
	Double calculateYearlySalary(){
		return (monthlySalary * 12);
	}

	//method to evaluate raise in salary
	void reviseMonthlySalary(Double raisePerceent){
		this.monthlySalary = this.monthlySalary + ((raisePerceent/100)*this.monthlySalary);
	}
	
	//method to display employee information
	void displayEmployeeInformation(){
		System.out.println("Employee Name : " + firstName + " " + lastName);
		System.out.println("Employee Monthly Salary : " + monthlySalary);
		System.out.println("Employee Yearly Salary : " + calculateYearlySalary());
	}
}