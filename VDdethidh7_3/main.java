package VDdethidh7_3;

import java.util.Scanner;

public class main {
	public static int benhnhann() throws Exception {
		Scanner a = new Scanner(System.in);
		int n =0;
		boolean benhnhann=false;
		while(!benhnhann) {
			try {
				n=a.nextInt();
				benhnhann = true;
			}catch (Exception e) {
				System.out.println("Ban nhap sai");a.nextLine();
			}
		}if(n<0)throw new Exception("khong hop le");return n;
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n= benhnhann();
		int i;
		benhnhan[] bn = new benhnhan[n];
		for (i = 0; i < bn.length; i++) {
			System.out.println("Danh sach: " + (i+1));
			bn[i] = new benhnhan();
			bn[i].nhap();
		}/*System.out.println("--------------------------------------------------");
		for (i = 0; i < bn.length; i++) {
			bn[i].xuat();
		}System.out.println("--------------------------------------------------");
		int ncmt = a.nextInt();
		for (i = 0; i < bn.length; i++) {
			if (bn[i].cmt == ncmt) {
				System.out.println("Thong tin: ");
				bn[i].xuat();
			}
		}System.out.println("--------------------------------------------------");
		for(i=0;i<bn.length;i++) {
			if(bn[i].trieuchung.equals("viem hong")) {
				System.out.println("Thong tin: ");
				bn[i].xuat();
			}
		}*/System.out.println("--------------------------------------------------");
		int x=bn.length;
		for(i=0;i<bn.length;i++) {
			if(bn[i].hoten.equals("a")) {
				for(int j=i;j<bn.length-1;j++) {
					bn[j]=bn[j+1];
				}x--;
			}
		}for(i=0;i<x;i++) {
		System.out.println("DS: ");bn[i].xuat();
}
	
	}
}