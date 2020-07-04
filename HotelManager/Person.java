package HotelManager;

import java.util.Scanner;

public class Person {
	private String name, date, sex, add;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public Person(String name, String date, String sex, String add) {
		super();
		this.name = name;
		this.date = date;
		this.sex = sex;
		this.add = add;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void In() {
		Scanner a = new Scanner(System.in);
		System.out.println("Name: ");
		name = a.nextLine();
		System.out.println("Date: ");
		date = a.nextLine();
		System.out.println("Sex: ");
		sex = a.nextLine();
		System.out.println("Add: ");
		add = a.nextLine();
	}

	public void Out() {
		System.out.println(name + date + sex + add);
	}
}
