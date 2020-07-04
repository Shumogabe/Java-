package VDdethidh7_2;

import java.util.Scanner;

public class May {
	String tenNSX, diachi, nhanhieu; int giathanh;
	
	public May() {
		super();
		// TODO Auto-generated constructor stub
	}
	public May(String tenNSX, String diachi, String nhanhieu, int giathanh) {
		super();
		this.tenNSX = tenNSX;
		this.diachi = diachi;
		this.nhanhieu = nhanhieu;
		this.giathanh = giathanh;
	}
	public String getTenNSX() {
		return tenNSX;
	}
	public void setTenNSX(String tenNSX) {
		this.tenNSX = tenNSX;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getNhanhieu() {
		return nhanhieu;
	}
	public void setNhanhieu(String nhanhieu) {
		this.nhanhieu = nhanhieu;
	}
	public int getGiathanh() {
		return giathanh;
	}
	public void setGiathanh(int giathanh) {
		this.giathanh = giathanh;
	}
	public void Nhap() {
	Scanner a = new Scanner(System.in);
	tenNSX=a.nextLine();	
	diachi=a.nextLine();	
	nhanhieu=a.nextLine();	
	giathanh=a.nextInt();	
	}	
	public void Xuat() {
	System.out.println(tenNSX+"\n"+diachi+"\n"+nhanhieu+"\n"+giathanh);	
	}
	
}
