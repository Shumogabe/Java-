package Employee;

import java.util.Scanner;

public class Employee {
	int Id;
	String Name;
	int Age;
	long Salary;
	void getData()
	{
		Scanner sc =new Scanner(System.in);
		Id = Integer.parseInt(sc.nextLine());
		System.out.println("\n\tTen NV: ");
		Name = sc.nextLine();
		System.out.println("\n\tTuoi NV: ");
		Age = Integer.parseInt(sc.nextLine());
		System.out.println("\n\tLuong NV: ");
		Salary = Integer.parseInt(sc.nextLine());
	}
	void putData()
	{
		System.out.println("\n\t"+Id+"\t"+Name+"\t"+Age+"\t"+Salary);
	}
}
