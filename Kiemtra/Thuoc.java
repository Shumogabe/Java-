package Kiemtra;

import java.util.Scanner;

public class Thuoc {
	private String ma_HoangPhuc, nuocsx;
	private boolean chatgaynghien;
	private int gio, phut, giay;
	private int ngaysx;

	public String getMa_HoangPhuc() {
		return ma_HoangPhuc;
	}

	public void setMa_HoangPhuc(String ma_HoangPhuc) {
		this.ma_HoangPhuc = ma_HoangPhuc;
	}

	public String getNuocsx() {
		return nuocsx;
	}

	public void setNuocsx(String nuocsx) {
		this.nuocsx = nuocsx;
	}

	public boolean isChatgaynghien() {
		return chatgaynghien;
	}

	public void setChatgaynghien(boolean chatgaynghien) {
		this.chatgaynghien = chatgaynghien;
	}

	public int getGio() {
		return gio;
	}

	public void setGio(int gio) {
		this.gio = gio;
	}

	public int getPhut() {
		return phut;
	}

	public void setPhut(int phut) {
		this.phut = phut;
	}

	public int getGiay() {
		return giay;
	}

	public void setGiay(int giay) {
		this.giay = giay;
	}

	public int getNgaysx() {
		return ngaysx;
	}

	public void setNgaysx(int ngaysx) {
		this.ngaysx = ngaysx;
	}

	public Thuoc(String ma_HoangPhuc, String nuocsx, boolean chatgaynghien, int gio, int phut, int giay, int ngaysx) {
		super();
		this.ma_HoangPhuc = ma_HoangPhuc;
		this.nuocsx = nuocsx;
		this.chatgaynghien = chatgaynghien;
		this.gio = gio;
		this.phut = phut;
		this.giay = giay;
		this.ngaysx = ngaysx;
	}

	public Thuoc() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void In() {
		Scanner a = new Scanner(System.in);
		System.out.println("Ma ");
		ma_HoangPhuc = a.nextLine();
		System.out.println("Chat gay nghien ");
		chatgaynghien = a.hasNext();
		System.out.println("Nuoc san xuat");
		nuocsx = a.nextLine();
		System.out.println("Thoi gian ");
		System.out.println("Gio ");
		gio = a.nextInt();
		System.out.println("Phut ");
		phut = a.nextInt();
		System.out.println("Giay ");
		giay = a.nextInt();
		System.out.println("Ngay sx ");
		ngaysx = a.nextInt();
	}
	
	public void Out() {
		System.out.println("Ma " + ma_HoangPhuc);
		System.out.println("Nuoc san xuat " + nuocsx);
		if (chatgaynghien == true)
		   {
		      System.out.println("Co chat gay nghien");
		   }
		   else{
		      System.out.println("Khong co chat gay nghien");
		   }
		System.out.println("Thoi gian " + gio +":"+ phut +":"+ giay);
		System.out.println("Ngay san xuat " + ngaysx);
	}
}
