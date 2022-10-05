package Cac_bai_co_ban;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
public class t17_cau_lenh_dieu_kien 
{
	public static void IF_ELSE()
	{
		/*
		 * int n; Scanner scanner = new Scanner(System.in);
		 * System.out.println("Nhap n: "); n = scanner.nextInt();
		 * 
		 * if(n%2==0) { System.out.println("So chan! "); } else {
		 * System.out.println("So le!"); }
		 */
		
		
		//PT bac nhat
		/*
		 * double a,b,x; Scanner scanner = new Scanner(System.in);
		 * System.out.println("Nhap a: "); a = scanner.nextDouble();
		 * System.out.println("Nhap b: "); b = scanner.nextDouble();
		 * 
		 * if(a == 0) { if(b == 0) { System.out.println("Phuong trinh vo so nghiem!"); }
		 * else { System.out.println("Phuong trinh vo nghiem!"); } } else { x = -b/a;
		 * System.out.println("Nghiem cua phuong trinh = " + a ); }
		 */
		
		//PT bac 2
		
		double a , b , c , x1 , x2 , delta;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap a: ");
		a = scanner.nextDouble();
		
		System.out.println("Nhap b: ");
		b = scanner.nextDouble();
		
		System.out.println("Nhap c: ");
		c = scanner.nextDouble();
		
		delta = Math.pow(b , 2) - 4*a*c;
		
		if(delta<0)
		{
			System.out.println("Phuong trinh vo nghieim!");
		}
		else if(delta == 0) 
		{
			x1 = x2 = -b/(2 * a);
			System.out.println("x1 = " + x1 + "\nx2 = " + x2);
		}
		else 
		{
			
		}
	}
}
