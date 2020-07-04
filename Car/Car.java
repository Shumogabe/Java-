package Car;

import java.util.Scanner;

public class Car {
	private String maxe, dungtichthieuso, nuocsx;
	private boolean cuasotroi;
  
	public String getMaxe() { 
		return maxe;
	}

	public void setMaxe(String maxe) {
		this.maxe = maxe;
	}

	public String getDungtichthieuso() {
		return dungtichthieuso;
	}

	public void setDungtichthieuso(String dungtichthieuso) {
		this.dungtichthieuso = dungtichthieuso;
	}

	public String getNuocsx() {
		return nuocsx;
	}

	public void setNuocsx(String nuocsx) {
		this.nuocsx = nuocsx;
	}

	public boolean isCuasotroi() {
		return cuasotroi;
	}

	public void setCuasotroi(boolean cuasotroi) {
		this.cuasotroi = cuasotroi;
	}

	public Car(String maxe, String dungtichthieuso, String nuocsx, boolean cuasotroi) {
		super();
		this.maxe = maxe;
		this.dungtichthieuso = dungtichthieuso;
		this.nuocsx = nuocsx;
		this.cuasotroi = cuasotroi;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void In() {
		Scanner a = new Scanner(System.in);
		System.out.println("Ma xe: ");
		maxe = a.nextLine();
		System.out.println("Dung tich thieu so: ");
		dungtichthieuso = a.nextLine();
		System.out.println("Nuoc sx: ");
		nuocsx = a.nextLine();
		System.out.println("Cua so troi: ");
		cuasotroi = a.hasNext();
	}

	public void Out() {

		System.out.println("Ma xe: " + maxe);
		System.out.println("Dung tich thieu so: " + dungtichthieuso);
		System.out.println("Nuoc sx: " + nuocsx);
		System.out.println("Cua so troi: " + cuasotroi);
	}

}
