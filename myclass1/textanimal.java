package myclass1;

public class textanimal { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		animal myanimal = new animal();
		//myanimal.nam="minh";
		//myanimal.numberoflegs=4;
		myanimal.setname("Eagle");
		myanimal.setaverageweight(1.5);
		myanimal.setnumberoflegs(2);
		System.out.println("Name: "+ myanimal.getname());
		System.out.println("Average Weight: "+ myanimal.getaverageweight() +"kg");
		System.out.println("Numer of legs: "+ myanimal.getnumberoflegs());
		
	}

}
