package VDdethidh7_2;

import java.util.Scanner;

public class Mayin extends May {
	int tocdoin, dophangiai;
	
	public Mayin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mayin(String tenNSX, String diachi, String nhanhieu, int giathanh, int tocdoin, int dophangiai) {
		super();
		this.tocdoin = tocdoin;
		this.dophangiai = dophangiai;
	}
	public int getTocdoin() {
		return tocdoin;
	}
	public void setTocdoin(int tocdoin) {
		this.tocdoin = tocdoin;
	}
	public int getDophangiai() {
		return dophangiai;
	}
	public void setDophangiai(int dophangiai) {
		this.dophangiai = dophangiai;
	}
	public void Nhap() {
	super.Nhap();
	Scanner a = new Scanner(System.in);
	tocdoin=a.nextInt();
	dophangiai=a.nextInt();
	}
	public void Xuat() {
		super.Xuat();
		System.out.println(tocdoin+"\n"+dophangiai);
	}
}
