package text;

public class Ford extends Car { 
	int year;   
	int manufacturerDiscount;
	public Ford(int speed, double regularPrice, String color,int year,int manufacturerDiscount) {
		super(speed, regularPrice, color);		
		}
	public double getSalePrice()
		{return super.getSalePrice()-manufacturerDiscount;}
		
}
    