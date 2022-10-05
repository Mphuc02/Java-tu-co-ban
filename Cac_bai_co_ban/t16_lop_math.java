package Cac_bai_co_ban;

import java.util.Scanner;


public class t16_lop_math {
	public static void HCN()
	{
		double a,b;
		Scanner bp = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a = bp.nextDouble();
		System.out.println("Nhap b: ");
		b = bp.nextDouble();
		
		//Khai bao lop Math
		System.out.println("|a| = " + Math.abs(a));
		System.out.println("min(a,b) = " + Math.min(a, b));
		
		System.out.println("sqrt(a) = " + Math.sqrt(a) );
		System.out.println("sqrt(a) = " + Math.ceil(Math.sqrt(a)));
		
		//Neu van con nhap vao thi khong duoc dung bp.close. Neu khong cac scanner khac se khong dung duoc
	}
	public static void Hinh_tron()
	{
		double R=0,dientich,chuvi;
		Scanner ap = new Scanner(System.in);
		System.out.println("Nhap ban kinh: ");
		R = ap.nextDouble();
		
		chuvi = 2 * Math.PI * R;
		dientich = Math.PI * Math.pow(R , 2);
		System.out.println("Chu vi = " + chuvi + " Dien tich = " + dientich);
		
		//Lay 2 so sau dau phay
		System.out.println("Chu vi = " + Math.round(chuvi * 100.0) /100.0);
		ap.close(); 
	}
	public static void lop_math()
	{
		HCN();
		Hinh_tron();
	}
}
