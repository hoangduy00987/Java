import java.util.Scanner;

public class bai_8 {
public static void main(String[] args) {
	// k.hai bao bien
	int a,b;
	//nhap du lieu
	Scanner s = new Scanner(System.in);
	System.out.println("nhap vao a = ");
	a = s.nextInt();
	System.out.println("nhap vao b = ");
	b= s.nextInt();
	
	int tong = a+b;
	System.out.println(a+"+"+b+"="+tong);
	int tru = a-b;
	System.out.println(a+"-"+b+"="+tru);
	int nhan = a*b;
	System.out.println(a+"*"+b+"="+nhan);
	float chia = (float)a/b;
	System.out.println(a+"/"+b+"="+chia);
	int du = a%b;
	System.out.println(a+"%"+b+"="+du);
}
}
