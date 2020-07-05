package VDdethidh7_2;

import java.util.Scanner;

public class main {
	public static int mayin() throws Exception{
		Scanner a = new Scanner(System.in);
		int n =0;boolean mayin = false;while(!mayin) {
			try {
				n = a.nextInt();
				mayin = true;
			}catch (Exception e) {
				System.out.println("Sai");a.nextLine();
			}
		}if(n<0) throw new Exception("sai"); return n;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int n=mayin();n = a.nextInt();
		Mayin[] mi = new Mayin[n];
		for (int i = 0; i < mi.length; i++) {
			// a.nextLine();
			System.out.println("Danh sach may in " + (i + 1) + ": ");
			mi[i] = new Mayin();
			mi[i].Nhap();
		}
		for (int i = 0; i < mi.length; i++) {
			mi[i].Xuat();
		}
		for (int i = 0; i < mi.length; i++) {
			if (mi[i].getTenNSX().equals("Canon"))

				mi[i].Xuat();
		}System.out.println("--------------------------------------------------");

		Mayin t;
		for (int i = 0; i < mi.length; i++) {
			for (int j = i + 1; j < mi.length; j++) {
				if (mi[i].getGiathanh() < mi[j].getGiathanh()) {
					t = mi[i];
					mi[i] = mi[j];
					mi[j] = t;
				}

			}

		}System.out.println("--------------------------------------------------");
		System.out.println("Day sau khi duoc sap xep");
		for (int i = 0; i < mi.length; i++) {
			mi[i].Xuat();
		}
		Mayin min = mi[0];
		for (int i = 0; i < mi.length; i++) {
			if (mi[i].getGiathanh() < min.getGiathanh()) {
				min = mi[i];
			}
		}System.out.println("--------------------------------------------------");
		System.out.println("Min");
		min.Xuat();

	}
}
