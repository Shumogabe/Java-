package HotelManager;

import java.util.Scanner;

public class WhoRent extends Person {
	private String dayrent, roomrent, price;

	public String getDayrent() {
		return dayrent;
	}

	public void setDayrent(String dayrent) {
		this.dayrent = dayrent;
	}

	public String getRoomrent() {
		return roomrent;
	}

	public void setRoomrent(String roomrent) {
		this.roomrent = roomrent;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public WhoRent(String name, String date, String sex, String add, String dayrent, String roomrent, String price) {
		super(name, date, sex, add);
		this.dayrent = dayrent;
		this.roomrent = roomrent;
		this.price = price;
	}

	public WhoRent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WhoRent(String name, String date, String sex, String add) {
		super(name, date, sex, add);
		// TODO Auto-generated constructor stub
	}

	public void In() {
		super.In();
		Scanner a = new Scanner(System.in);
		System.out.println("Day rent: ");
		dayrent = a.nextLine();
		System.out.println("Room rent: ");
		roomrent = a.nextLine();
		System.out.println("price: ");
		price = a.nextLine();
	}
	public void Out() {
		super.Out();
		System.out.println(dayrent+roomrent+price);
	}
}
