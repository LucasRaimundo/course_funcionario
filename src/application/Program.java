package application;

import java.util.Scanner;



import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.print("Name: ");
		emp.name = ler.nextLine();
		System.out.print("GrossSalary: ");
		emp.grossSalary = ler.nextDouble();
		System.out.print("Tax: ");
		emp.tax = ler.nextDouble();
		
		System.out.println(emp);
		
		System.out.print("Which percentage to increase salary? ");
		double porc = ler.nextDouble();
		emp.increaseSalary(porc);
		
		System.out.print(emp);
		ler.close();
	}

}
