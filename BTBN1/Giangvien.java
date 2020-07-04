package BTBN1;

import java.util.Scanner;

public class Giangvien extends Nguoi {
	String lopday;
	int luongmotgioday;
	int sogiodaytrongthang;

	public String getLopday() {
		return lopday;
	}

	public void setLopday(String lopday) {
		this.lopday = lopday;
	}

	public int getLuongmotgioday() {
		return luongmotgioday;
	}

	public void setLuongmotgioday(int luongmotgioday) {
		this.luongmotgioday = luongmotgioday;
	}

	public int getSogiodaytrongthang() {
		return sogiodaytrongthang;
	}

	public void setSogiodaytrongthang(int sogiodaytrongthang) {
		this.sogiodaytrongthang = sogiodaytrongthang;
	}

	public Giangvien() {
	}

	public Giangvien(String ten, String gioitinh, String ngaysinh, String diachi, String lopday, int luongmotgioday,
			int sogiodaytrongthang) {
		super(ten, gioitinh, ngaysinh, diachi);
		this.lopday = lopday;
		this.luongmotgioday = luongmotgioday;
		this.sogiodaytrongthang = sogiodaytrongthang;
	}

	// Nhap va in
	public void nhap() {
		// Nhap
		Scanner b = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap lop day: ");
		lopday = b.nextLine();
		System.out.println("Nhap luong mot gio day: ");
		luongmotgioday = b.nextInt();
		System.out.println("Nhap so gio day trong thang: ");
		sogiodaytrongthang = b.nextInt();
	}
  
	public void in() {
		super.in();  
		System.out.println("Lop day: " + lopday);
		System.out.println("Luong mot gio day: " + luongmotgioday);
		System.out.println("So gio day trong thang: " + sogiodaytrongthang);
	}  

	public double tinhLuong() {
		double luong = 0;
		
		if (lopday.contentEquals("sang")) {
			luong = luongmotgioday * sogiodaytrongthang;
		} else if (lopday.contentEquals("toi")) {
			luong = luongmotgioday * sogiodaytrongthang + 200000; 
		}
		return luong;
	} 

}
