package Kiemtra;

import java.util.Scanner;

public class Main {

	public static int Sothuoc() throws Exception {
		Scanner a = new Scanner(System.in);
		int n = 0;
		boolean Sothuoc = false;
		while (!Sothuoc) {
			try {
				n = a.nextInt();
				Sothuoc = true;
			} catch (Exception e) {
				System.out.println("Ban nhap sai kieu du lieu \n Moi nhap lai : ");
				a.nextLine();
			}
		}
		if (n < 0)
			throw new Exception("Khong hop le");
		return n;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("So thuoc: ");
		int n = Sothuoc();
		Vitamin[] vt = new Vitamin[n];
		for (int i = 0; i < vt.length; i++) {
			System.out.println("Nhap thuoc thu " + (i + 1) + ": ");
			vt[i] = new Vitamin();
			vt[i].In();
		}

		System.out.println("Bang thuoc : ");
		for (int i = 0; i < vt.length; i++) {
			vt[i].Out();
		}
		Scanner a = new Scanner(System.in);
		System.out.println("Nhap so phut: ");
		int nhapsophut = a.nextInt();
		System.out.println("Nhap ngay san xuat: ");
		int ngaysxnhap = a.nextInt();
		System.out.println("Bang thuoc co so phut <= " + nhapsophut + " va ngay san xuat >=" + ngaysxnhap);
		for (int i = 0; i < vt.length; i++) {
			if (vt[i].getPhut() <= nhapsophut && vt[i].getNgaysx() >= ngaysxnhap)
				System.out.println("Vitamin: " + vt[i].getTen() + " -gia tri: " + vt[i].getGiatri() + " -Tinh trang: "
						+ vt[i].isTinhtrang());
		}
		int giaytb = 0;
		int tong = 0;
		int dem1 = 0;
		for (int i = 0; i < vt.length; i++) {
			if (vt[i].isTinhtrang() == true) {
				dem1++;
				tong = tong + vt[i].getGiay();
			}
		}
		giaytb = tong / dem1;
		System.out.println("Giay tb vitamin co tinh trang dung: " + giaytb);
	}
}
