package VDdethidh7_3;

import java.util.Scanner;

public class benhnhan extends nguoi {
	String tenbs, trieuchung, chuandoan;

	public String getTenbs() {
		return tenbs;
	}

	public void setTenbs(String tenbs) {
		this.tenbs = tenbs;
	}

	public String getTrieuchung() {
		return trieuchung;
	}

	public void setTrieuchung(String trieuchung) {
		this.trieuchung = trieuchung;
	}

	public String getChuandoan() {
		return chuandoan;
	}

	public void setChuandoan(String chuandoan) {
		this.chuandoan = chuandoan;
	}

	public benhnhan(String hoten, String ngaysinh, String diachi, int cmt, String tenbs, String trieuchung,
			String chuandoan) {
		super(hoten, ngaysinh, diachi, cmt);
		this.tenbs = tenbs;
		this.trieuchung = trieuchung;
		this.chuandoan = chuandoan;
	}

	public benhnhan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void nhap() {
		super.nhap();
		Scanner a = new Scanner(System.in);
		tenbs = a.nextLine();
		trieuchung = a.nextLine();
		chuandoan = a.nextLine();
	}

	public void xuat() {
		super.xuat();
		System.out.println(tenbs + trieuchung + chuandoan);
	}
}
