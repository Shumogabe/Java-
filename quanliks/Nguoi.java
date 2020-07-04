package quanliks;

import java.util.Scanner;

public class Nguoi {
	String hovaten, ngaysinh; int CMT;

	public String getHovaten() {
		return hovaten;
	}

	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public int getCMT() {
		return CMT;
	}

	public void setCMT(int cMT) {
		CMT = cMT;
	}

	public Nguoi(String hovaten, String ngaysinh, int cMT) {
		super();
		this.hovaten = hovaten;
		this.ngaysinh = ngaysinh;
		CMT = cMT;
	}

	public Nguoi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void Nhap() {
		Scanner a = new Scanner(System.in);
		System.out.println("Nhap ho & ten: ");
		hovaten=a.nextLine();
		System.out.println("Nhap ngay sinh: ");
		ngaysinh=a.nextLine();
		System.out.println("Nhap chung minh thu: ");
		CMT=a.nextInt();
	}
	public void Xuat() {
		System.out.println("ho & ten: "+hovaten);
		System.out.println("ngay sinh: "+ngaysinh);
		System.out.println("chung minh thu: "+CMT);
	}
}
