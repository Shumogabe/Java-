package BTBN2;

import java.util.Scanner;

public class Nguoi {
	String hoten, gioitinh, ngaysinh, quequan, diachi;

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getQuequan() {
		return quequan;
	}

	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public Nguoi(String hoten, String gioitinh, String ngaysinh, String quequan, String diachi) {
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.quequan = quequan;
		this.diachi = diachi;
	}

	public Nguoi() {

	}

	public void nhap() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoten = in.nextLine();
		System.out.println("Nhap gioi tinh : ");
		gioitinh = in.nextLine();
		System.out.println("Nhap ngay sinh: ");
		ngaysinh = in.nextLine();
		System.out.println("Nhap que quan: ");
		quequan = in.nextLine();
		System.out.println("Nhap dia chi: ");
		diachi = in.nextLine();
	}

	public void in() {
		System.out.println("Ho ten: " + hoten);
		System.out.println("Gioi tinh: " + gioitinh);
		System.out.println("Ngay sinh: " + ngaysinh);
		System.out.println("Que quan: " + quequan);
		System.out.println("Dia chi: " + diachi);
	}

}
