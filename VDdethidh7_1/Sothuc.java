package VDdethidh7_1;

import java.util.Scanner;

public class Sothuc {
	int phannguyen, phanthapphan;

	public int getPhannguyen() {
		return phannguyen;
	}

	public void setPhannguyen(int phannguyen) {
		this.phannguyen = phannguyen;
	}

	public int getPhanthapphan() {
		return phanthapphan;
	}

	public void setPhanthapphan(int phanthapphan) {
		this.phanthapphan = phanthapphan;
	}

	public Sothuc(int phannguyen, int phanthapphan) {
		super();
		this.phannguyen = phannguyen;
		this.phanthapphan = phanthapphan;
	}

	public Sothuc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void Nhap() {
		Scanner a = new Scanner(System.in);
		phannguyen=a.nextInt();
		phanthapphan=a.nextInt();
	}
	public void Xuat() {
		System.out.println(phannguyen+","+phanthapphan);
	}
}
