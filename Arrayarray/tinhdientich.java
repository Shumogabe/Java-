package Arrayarray;

import java.util.*;

public class tinhdientich {
	public static void main(String[] args) {
		hcn[] hcn =new hcn[5];
		double cao;
		double rong;
		Scanner a = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			System.out.println("cao "+(i+1)+": ");
			cao = a.nextDouble();
			System.out.println("rong "+(i+1)+": ");
			rong = a.nextDouble();
			
	 		hcn[i]=new hcn(cao,rong);
			System.out.println();
		}
	for (int i=0;i<5; i++) {
		System.out.println("dientich "+(i+1)+": "+hcn[i].getArea());
	}
	}
	
	
}
