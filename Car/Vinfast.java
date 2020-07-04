package Car;

import java.util.Date;
import java.util.Scanner;

public class Vinfast extends Car {
	String tenxe;
	int giatien;
	Date thoigianxuatsuong;

	public String getTenxe() {
		return tenxe;
	}
 
	public void setTenxe(String tenxe) {
		this.tenxe = tenxe;
	}

	public int getGiatien() {
		return giatien;
	}

	public void setGiatien(int giatien) {
		this.giatien = giatien;
	}

	public Date getThoigianxuatsuong() {
		return thoigianxuatsuong;
	}

	public void setThoigianxuatsuong(Date thoigianxuatsuong) {
		this.thoigianxuatsuong = thoigianxuatsuong;
	}

	public Vinfast(String maxe, String dungtichthieuso, String nuocsx, boolean cuasotroi, String tenxe, int giatien,
			Date thoigianxuatsuong) {
		super(maxe, dungtichthieuso, nuocsx, cuasotroi);
		this.tenxe = tenxe;
		this.giatien = giatien;
		this.thoigianxuatsuong = thoigianxuatsuong;
	}

	public Vinfast() {  
		super();
		// TODO Auto-generated constructor stub
	}
	public void In() {
		super.In(); 
		Scanner a = new Scanner(System.in);
		System.out.println("Ten xe: ");
		tenxe = a.nextLine();
		System.out.println("Gia tien: ");
		giatien = a.nextInt();
		System.out.println("Thoi gian xs: ");
		//thoigianxuatsuong = a.;

	}

	public void Out() {
		super.Out();
		System.out.println("Ten xe: " + tenxe);
		System.out.println("Gia tien: " + giatien);
		System.out.println("Thoi gian xs: " + thoigianxuatsuong);
	}
}
