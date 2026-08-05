package application;

import java.util.Scanner;

import entities.Employee;

import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
	    Employee employee = new Employee();
	    
	    double percentage;
        
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee.name + ", $ " + employee.netSalary());
		
		System.out.print("Which percentage to increase salary? ");
		percentage = sc.nextDouble();

		employee.increaseSalary(percentage);
		
		System.out.print("Updated data: " + employee.name + ", $ " + employee.netSalary());
		
	}
}
