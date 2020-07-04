package Arrayarray;
import java.util.Scanner;
import java.util.Arrays;
public class ReadingWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int b = a.nextInt();
		int [] array = new int[b];
		System.out.println("Nhap b :");
		for(int i=0; i<b; i++) {
			array[i]=a.nextInt();
		}
	System.out.println(Arrays.toString(array));
	} 
	
}
