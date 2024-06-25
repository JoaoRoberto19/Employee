package Application2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities2.Employee;
import Entities2.OutsourcedEmployee;

public class ex008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Employee> list = new ArrayList<>();
		
		
		System.out.println("Enter the number of employees:  ");
		int N = sc.nextInt();
		
		for(int i=1; i<=N;i++) {
			System.out.println("Employee" + i +  "data: ");
			System.out.println("Outsourced (y/n): ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();	
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("valuePerHour: ");
			double valuePerHour = sc.nextDouble();
			
			
			if (ch == 'y') {
				System.out.print("Addtional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours , valuePerHour,  additionalCharge));
			}
			else {
				list.add(new  Employee(name, hours, valuePerHour));
			}	
		}
		
		System.out.println();
		System.out.print("Payments: ");
		
		for (Employee emp : list) {
			System.out.println(emp.getName() + "- $" + String.format("%.2f", emp.payment()));
		}
		
		
		
		
		
		sc.close();
	}
	

}
