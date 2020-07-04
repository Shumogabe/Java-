package BTBN3;

import java.util.Scanner;

public class sdadasdasdasdasd {
	public static void main(String[] args) {
		int n, k, x;
		int a[] = new int[100];
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		k = in.nextInt();
		x = in.nextInt();
		for (int i = n; i > k + 1; i--) {
			a[i] = a[i - 1];
		}
		a[k] = x;
		n++;
		for (int i = 0; i < n; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
