package text1;

public class teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryearned;
	public teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryearned = 0;
	}
	
	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}
  
	public void setname(String name) {
		this.name = name;
	}

	public int getsalary() {
		return salary;
	}

	public void setsalary(int salary) { 
		this.salary = salary;
	}

	public int getsalaryearned() {
		return salaryearned;
	}

	public void setsalaryearned(int salaryearned) {
		this.salaryearned = salaryearned;
	}

	public void recaivesalary(int salary) {
		salaryearned+=salary;school.updatetotalmoneyspent(salaryearned); 
	}
	
	public String toString() {return "Teacher's name"+name+"Total salary earned so far $"+salaryearned;}
}
