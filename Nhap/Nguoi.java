package Nhap;
import java.util.Scanner;
public class Nguoi {
private String hoten, gioitinh, date, diachi;
public String getHoten() {
return hoten;
}
public void setHoten(String hoten) {
this.hoten = hoten;
}
public String getGioitinh() {
return gioitinh;
}
public void setGioitinh(String gioitinh) {
this.gioitinh = gioitinh;
}
public String getDate() {
return date;
}
public void setDate(String date) {
this.date = date;
}
public String getDiachi() {
return diachi;
}
public void setDiachi(String diachi) {
this.diachi = diachi;
}
public Nguoi() {
}
public Nguoi(String hoten, String gioitinh, String date,
String diachi) {
this.hoten = hoten;
this.gioitinh = gioitinh;
this.date = date;
this.diachi = diachi;
}
public void nhap() {
Scanner scanner = new Scanner(System.in);
System.out.print("hoten: ");
hoten = scanner.nextLine();
System.out.print("gioi tinh: ");
gioitinh = scanner.nextLine();
System.out.print("ngay sinh: ");
date = scanner.nextLine();
System.out.print("Dia chi: ");
diachi = scanner.nextLine();
}
public void xuat() {
System.out.println("Thong tin nguoi duoc nhap: ");
System.out.println("ho ten: "+hoten);
System.out.println("gioi tinh: "+gioitinh);
System.out.println("ngay sinh: "+date);
System.out.println("dia chi: "+diachi);
}
public static void main(String[] args) {
Nguoi d = new Nguoi();
d.nhap();
d.xuat();
}

}
