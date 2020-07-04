package quanliks;

import java.util.Scanner;

public class KhachThue extends Nguoi {
	int songaythue, giaphong; String loaiphong;

	public int getSongaythue() {
		return songaythue;
	}

	public void setSongaythue(int songaythue) {
		this.songaythue = songaythue;
	}

	public int getGiaphong() {
		return giaphong;
	}

	public void setGiaphong(int giaphong) {
		this.giaphong = giaphong;
	}

	public String getLoaiphong() {
		return loaiphong;
	}

	public void setLoaiphong(String loaiphong) {
		this.loaiphong = loaiphong;
	}

	public KhachThue(String hovaten, String ngaysinh, int cMT, int songaythue, int giaphong, String loaiphong) {
		super(hovaten, ngaysinh, cMT);
		this.songaythue = songaythue;
		this.giaphong = giaphong;
		this.loaiphong = loaiphong;
	}

	public KhachThue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void Nhap() {
		super.Nhap();
		Scanner a = new Scanner(System.in);
		System.out.println("Nhap so ngay thue: ");
		songaythue=a.nextInt();
		System.out.println("Nhap gia phong: ");
		giaphong=a.nextInt();
		System.out.println("Nhap loai phong: ");
		loaiphong=a.nextLine();
	}
	public void Xuat() {
		super.Xuat();
		System.out.println("Nhap so ngay thue: "+songaythue);
		System.out.println("Nhap gia phong: "+giaphong);
		System.out.println("Nhap loai phong: "+loaiphong);
	}

}
