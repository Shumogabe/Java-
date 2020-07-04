package BTBN1;

import java.util.Scanner;

public class Main {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so nguoi: "); 
		int n = in.nextInt(); 
		Giangvien[] gv = new Giangvien[n];
		for (int i = 0; i < gv.length; i++) {
			in.nextLine(); 
			System.out.println("GV " + (i + 1) + ": ");
			gv[i] = new Giangvien();
			gv[i].nhap();
		}
		System.out.println("bang luong nhan vien: ");
		for (int i = 0; i < gv.length; i++) {
			System.out.println("Giang vien: " + gv[i].getTen() + " - Luong: " + gv[i].tinhLuong());
 
		}
		 
	}
}
