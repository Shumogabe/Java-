package HotelManager;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("Enter number of Guest: ");
		int n = a.nextInt();
		WhoRent[] wr=new WhoRent[n];
		for (int i=0;i<wr.length;i++) {
			a.nextLine();
			System.out.println("Per "+(i+1)+": ");
			wr[i] = new WhoRent();
			wr[i].In();
		}
		for (int i=0;i<wr.length;i++) {
			wr[i].Out();
		}
		
	}

}
