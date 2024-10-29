package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n;i++) {
			System.out.println("Employee #" + i + "data:");
			System.out.print("Outsourced (y/n)?");
			char ch = sc.next().charAt(0);
			System.out.print();
		}
		
		
		
		
		sc.close();
	}

}
