/*Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a. Hãy in lần lượt các số nguyên tố có trong dãy a ra màn hình, sau mỗi phần tử có đúng một khoảng trắng.
(Số nguyên tố là số nguyên dương có đúng 2 ước là 1 và chính nó. Số a được gọi là ước của b nếu b chia hết cho a). Biết rằng dãy sẽ có ít nhất một số nguyên tố.
Ví dụ:
Test mẫu 1:
Input	
4
1 2 3 4
Output
2 3 
Với n = 4, a = [1, 2, 3, 4] thì kết quả mong muốn là: "2 3 ".
Test mẫu 2:
Input	
3
7 2 3
Output
7 2 3
Với n = 3, a = [7, 2, 3] thì kết quả mong muốn là: "7 2 3 ".*/
package BTBN3;

import java.util.Scanner;

public class in_so_nguyen_to {
	public static boolean isPrime(int k) {
		if (k<2) return false; 
		for (int i = 2; i <= Math.sqrt(k); i++) {
			if(k%i==0)return false;
		}return true;
		}
	public static void main(String[] args) {
		int n;
		int a[] = new int[100];
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (isPrime(a[i])) {
			System.out.print(a[i] + " ");
		}}
	}
}