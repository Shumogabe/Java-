package Arrayarray;

import java.util.Scanner;

public class Apples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so nguoi: ");
		a = in.nextInt();
		String [] ten = new String[a];
		for (int b=0; b<a; b++) {
			in.nextLine();
			System.out.println("Ten: "+(b+1));
			ten[b] = in.nextLine();
		}
		System.out.println("Bn: ");
		for (int b=0; b<a; b++) {
			System.out.println(ten[b]); 
		}
	}

}
