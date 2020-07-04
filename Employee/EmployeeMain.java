package Employee;

public class EmployeeMain {
	public static void main(String arg[])
	{
		Employee[] Emp = new Employee[3];
		int i;
		for (i=0;i<3;i++)
			Emp[i] = new Employee();
		for (i=0;i<3;i++)
		{
			System.out.println("\nNhap thong tin cua"+(i+1)+"NV\n");
		}
		System.out.println("\nThong tin NV\n");
		for(i=0;i<3;i++)
			Emp[i].putData();
	}
}
