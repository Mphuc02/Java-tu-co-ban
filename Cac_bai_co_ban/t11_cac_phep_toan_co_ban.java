package Cac_bai_co_ban;
import java.util.Scanner;
public class t11_cac_phep_toan_co_ban {

	public static void Phep_toan()
	{
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap a: ");
		a = sc.nextInt();
		
		System.out.println("Nhap b: ");
		b=sc.nextInt();
		
		int tong = a+b;
		
		System.out.println("a + b = " + tong);
		
		int hieu = a-b;
		System.out.println("a - b = "+hieu);
		
		float thuong = (float) a / b;
		System.out.println("a / b = " + thuong);
	}
}
