package Car;

import java.text.SimpleDateFormat; 
import java.util.Calendar;
import java.util.Date;

public class ngaythang { 

	public static void main(String[] argv) {
		String dateString = "6/5/2017";
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false); // set false để kiểm tra tính hợp lệ của date. VD: tháng 2 phải có 28-29 ngày,
								// năm có 12 tháng,....
		try {
			df.parse(dateString); // parse dateString thành kiểu Date
		} catch (Exception e) { // quăng lỗi nếu dateString ko hợp lệ
			System.out.println("Invalid date");
		}
	}
}