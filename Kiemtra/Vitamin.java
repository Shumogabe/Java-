package Kiemtra;

import java.util.Scanner;

public class Vitamin extends Thuoc {
	private String ten;
	private int giatri;
	private boolean tinhtrang = true;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getGiatri() {
		return giatri;
	}

	public void setGiatri(int giatri) {
		this.giatri = giatri;
	}

	public boolean isTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(boolean tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

	public Vitamin(String ma_HoangPhuc, String nuocsx, boolean chatgaynghien, int gio, int phut, int giay, int ngaysx,
			String ten, int giatri, boolean tinhtrang) {
		super(ma_HoangPhuc, nuocsx, chatgaynghien, gio, phut, giay, ngaysx);
		this.ten = ten;
		this.giatri = giatri;
		this.tinhtrang = tinhtrang;
	}

	public Vitamin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void In() {
		super.In();
		Scanner a = new Scanner(System.in);
		System.out.println("Ten ");
		ten = a.nextLine();
		System.out.println("Gia tri ");
		giatri = a.nextInt();
	}

	public void Out() {
		super.Out();
		System.out.println("Ten " + ten);
		System.out.println("Gia tri " + giatri);
		if (getNgaysx() <= 28 && getGio() <= 13) {
			System.out.println("Tinh trang " + tinhtrang);
		}
	}

}
