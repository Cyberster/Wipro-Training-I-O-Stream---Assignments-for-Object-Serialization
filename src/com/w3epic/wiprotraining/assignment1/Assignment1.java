/*
Create an employee object having properties name, date of birth, department, 
designation and salary. Let the employee class have appropriate getter/setters 
methods for accessing these properties. Initialize these properties through the 
setter methods. Store this object into a file "OutObject.txt". Read the same 
object from the same file and display its properties through getter methods.
 */

package com.w3epic.wiprotraining.assignment1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.w3epic.wiprotraining.assignment1.bean.Employee;

public class Assignment1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Enter name: ");
		emp.setName(sc.nextLine());
		System.out.print("Enter D.O.B.: ");
		emp.setDob(sc.nextLine());
		System.out.print("Enter department: ");
		emp.setDepartment(sc.nextLine());
		System.out.print("Enter designation: ");
		emp.setDesignation(sc.nextLine());
		System.out.print("Enter salary: ");
		emp.setSalary(sc.nextDouble());
		sc.nextLine();
		
		FileOutputStream fos = new FileOutputStream("OutObject.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
		FileInputStream fis = new FileInputStream("OutObject.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee) ois.readObject();
		
		System.out.println("Name: " + emp2.getName());
		System.out.println("D.O.B.: " + emp2.getDob());
		System.out.println("Department: " + emp2.getDepartment());
		System.out.println("Designation: " + emp2.getDesignation());
		System.out.println("Salary: " + emp2.getSalary());
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
		sc.close();
	}
	

}
