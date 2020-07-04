/*Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a. Tiếp theo nhập vào số nguyên là k (0 ≤ k < n).
Hãy xóa phần tử có chỉ số k ở trong dãy đó. In mảng kết quả ra màn hình, sau mỗi phần tử có đúng một khoảng trắng.
Ví dụ:
Test mẫu 1:
Input	
4
1 2 3 4
1
Output
1 3 4
Với n = 4, a = [1, 2, 3, 4], k = 1, thì kết quả mong muốn là: "1 3 4 ".
Test mẫu 2:
Input	
3
1 2 3
2
Output
1 2 
Với n = 3, a = [1, 2, 3], k = 2, thì kết quả mong muốn là: "1 2 ".*/
package BTBN3;

import java.util.Scanner;

public class xoa {
	public static void main(String[] args) {
		int n, k;
		int a[] = new int[100];
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		k = in.nextInt();
		for (int i = k; i < n; i++) {
			a[i] = a[i + 1];
		}
		n--;
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
