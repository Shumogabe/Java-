package BTBN1;

import java.util.Scanner;

public class Nguoi {
	private String ten, gioitinh, ngaysinh, diachi;
 
	// get & set
	public String getTen() {
		return ten;
	}
    
	public void setTen(String ten) {
		this.ten = ten;
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

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	// construction co tham so
	public Nguoi(String ten, String gioitinh, String ngaysinh, String diachi) {
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
	}
 
	// construction khong co tham so
	public Nguoi() {
	}

	// Nhap va in
	public void nhap() {
		// TODO Auto-generated method stub
		// Nhap vao
		Scanner a = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		ten = a.nextLine();
		System.out.println("Nhap gioi tinh: ");
		gioitinh = a.nextLine();
		System.out.println("Nhap ngay sinh: ");
		ngaysinh = a.nextLine();
		System.out.println("Nhap dia chi: ");
		diachi = a.nextLine();
	}
   
	public void in() {
		System.out.println("Ten: " + ten);
		System.out.println("Gioitinh: " + gioitinh);
		System.out.println("Ngay sinh: " + ngaysinh);
		System.out.println("Dia chi: " + diachi);
	}
}
