package quanliks;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("So khach: ");
		int n = a.nextInt();
		KhachThue[] kt = new KhachThue[n];
		for(int i=1; i<kt.length; i++) {
			System.out.println("Nhap so khach: ");
			kt[i]=new KhachThue();
			kt[i].Xuat();
		}
		System.out.println("Bang khach : ");
		for (int i = 0; i < kt.length; i++) {
			kt[i].Xuat();
		}
		System.out.println("Nhap ngay: ");
		int nhapngay=a.nextInt();
System.out.println("----------------------------------------------");
		int CMTn = a.nextInt(); 
		for (int i = 0; i < kt.length; i++) {
			if (kt[i].getCMT() == CMTn) {
				kt[i].Xuat();
			}
		}
		

	}

}
