package text;

public class MyOwnAutoShop {
 
	public static void main(String[] args) {
		Car mySedan = new Sedan(160,20000,"red",10);
		Car myFord1 = new Ford(156,30000,"blue",10,30);
		Car myFord2 = new Ford(140,10000,"pink",10,50);
		Car myCar = new Car(160,20000,"red");
		System.out.printf("Sedan price %.2f\n", mySedan.getSalePrice());
		System.out.printf("Ford1 price %.2f\n", mySedan.getSalePrice());
		System.out.printf("Ford2 price %.2f\n", mySedan.getSalePrice());
		System.out.printf("Car price %.2f\n", mySedan.getSalePrice());
		System.out.println("Sedan price"+ mySedan.getSalePrice());
		System.out.println(myCar);
	}
} 