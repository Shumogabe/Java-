package VDdethidh7_3;

import java.util.Scanner;

public class nguoi {
	String hoten, ngaysinh, diachi; int cmt;

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
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

	public int getCmt() {
		return cmt;
	}

	public void setCmt(int cmt) {
		this.cmt = cmt;
	}

	public nguoi(String hoten, String ngaysinh, String diachi, int cmt) {
		super();
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.cmt = cmt;
	}

	public nguoi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void nhap() {
		Scanner a = new Scanner(System.in);
		hoten=a.nextLine();
		ngaysinh=a.nextLine();
		diachi=a.nextLine();
		cmt=a.nextInt();
	}
	public void xuat() {
		System.out.println(hoten+ngaysinh+diachi+cmt);
	}
}
