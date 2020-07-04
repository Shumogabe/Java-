package Car;

import java.util.Scanner;

public class Main {
	public static int Soxe() throws Exception {
	    Scanner a = new Scanner(System.in);
	    int n = 0;
	    boolean Soxe=false;
	    
	    while (!Soxe) {
	    	try {
	            n = a.nextInt();
	            Soxe = true;
	        } catch (Exception e) {
	            System.out.println("ban nhap sai kieu du lieu \n moi nhap lai : ");
	            a.nextLine();
	        }
	    }
	    if (n<0) throw new Exception("khong hop le");return n;
	    }
	    
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		System.out.print("So xe: ");
		int n = Soxe();
		Vinfast[] vf = new Vinfast[n];
		for (int i = 0; i < vf.length; i++) {
			System.out.println("Nhap xe thu " + (i + 1) + ": ");
			vf[i] = new Vinfast();
			vf[i].In();
		}

		System.out.println("Bang xe : ");
		for (int i = 0; i < vf.length; i++) {
			vf[i].Out();
		}
	}
	}
	
