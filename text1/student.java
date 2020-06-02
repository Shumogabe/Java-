package text1;

public class student {
	private int id;
	private String name;
	private int grade;
	private int feespaid;
	private int feestotal;
	public student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feespaid = 0;
		this.feestotal = 30000;
	}
	public void payfees(int fees) {
		feespaid+=fees;school.updatetotalmoneyearned(feespaid);
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
	public int getgrade() {
		return grade;
	}
	public void setgrade(int grade) { 
		this.grade = grade;
	}
	public int getfeespaid() {
		return feespaid;
	}
	public void setfeespaid(int feespaid) {
		this.feespaid = feespaid;
	}
	public int getFeestotal() {
		return feestotal;
	}
	public void setfeestotal(int feestotal) {
		this.feestotal = feestotal;
	}
	int getRemainingfees() {
		return feestotal-feespaid;
	}
	public String toString() {return "Studetn's name"+name+"Total fees paid so far $"+feespaid;}

	
	}
