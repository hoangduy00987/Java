import java.util.Scanner;

public class bai_6 {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("nhap vao ho va ten: ");
	String hovaTen = sc.nextLine();
	System.out.println("nhap ma sinh vien:");
	long maSinhVien = sc.nextLong();
	System.out.println("nhap vao diem thi:");
	
	float diemThi = sc.nextFloat();
	System.out.println("-----------");
	System.out.println("ho va ten: "+ hovaTen);
	System.out.println("ma sinh vien:"+maSinhVien);
	System.out.println("diem thi :"+ diemThi);
	
	
}
}
