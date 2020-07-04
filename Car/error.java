package Car;

import java.util.Scanner;

public class error {
	/*public static int Soxe() {
	    Scanner a = new Scanner(System.in);
	    System.out.print("So xe: ");
	    int n = a.nextInt();
	    return n;
	}
	public static void main(String[] args) {
	try {
		int n= Soxe();
	}
	catch (Exception e) { 
	   System.out.println("khong hop le");
	}
}*/






public static int check() throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    boolean check = false; 
    if (n < 0) throw new Exception("khong hop le");
    while (!check) {
        try {
            n = sc.nextInt();
            check = true;
        } catch (Exception e) {
            System.out.println("ban nhap sai kieu du lieu \n moi nhap lai : ");
            sc.nextLine();
        }
    }
    return n;
}
// ham nhap
public static void main(String[] args) throws Exception {
    System.out.print("moi ban nhap so nguyen n = ");
   int n = check();
}
	
}