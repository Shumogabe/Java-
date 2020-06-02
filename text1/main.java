package text1;

import java.util.ArrayList;
import java.util.List; 

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teacher mai = new teacher(1,"Mai",900);
		teacher huy = new teacher(2,"Huy",500);
		teacher linh = new teacher(3,"Linh",600);
		List<teacher> teacherList= new ArrayList<>();
		teacherList.add(mai);
		teacherList.add(huy);
		teacherList.add(linh);
		
		student trang = new student(1,"Trang",9);
		student an = new student(2,"An",5);
		student minh = new student(3,"Minh",6);
		List<student> studentList= new ArrayList<>();
		studentList.add(trang);
		studentList.add(an);
		studentList.add(minh);
		
		school sch= new school(teacherList,studentList);
		teacher kim = new teacher(4,"Kim",700);
		sch.addteacher(kim);
		an.payfees(5000);
		trang.payfees(4000);
		System.out.println("SCH has earned $ "+sch.gettotalmoneyearned());
		System.out.println("----Making school pay salary----");
		mai.recaivesalary(mai.getsalary());
		System.out.println("SCH has spent for salary to "+mai.getname()+"and now has $ "+sch.gettotalmoneyspent());
		System.out.println(trang);
		huy.recaivesalary(huy.getsalary());
		System.out.println(huy);
		//in sv no phi 
		student duy = new student(4,"Duy",4);
		duy.payfees(0);
		if () {};
		//in gv luong > 600
		if 
	}

}
