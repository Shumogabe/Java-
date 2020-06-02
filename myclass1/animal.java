package myclass1;

public class animal {
	private String name;
	private double averageweight;
	private int numberoflegs; 
	//getter methods 
	public String getname() {
		return name;
	}
	public double getaverageweight() {
		return averageweight;
	}
	public int getnumberoflegs() {
		return numberoflegs;
	}
	//setter methods
	public void setname(String name) {
		this.name=name;
	}
	public void setaverageweight(double averageweight) {
		this.averageweight=averageweight;
	}
	public void setnumberoflegs(int numberoflegs) {
		this.numberoflegs=numberoflegs;
	}
}
