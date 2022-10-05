package Cac_bai_co_ban;

import java.util.Scanner;
public class t13_cach_gan_du_lieu {
	public static void gan_du_lieu()
	{
		Scanner scan = new Scanner(System.in);
		float a;
		System.out.println("Nhap so a: ");
		
		//Cac phep gan
		a = scan.nextFloat();
		
		System.out.println("a = "+a);
		
		a+=3;
		System.out.println("a = "+a);
		
		a-=3;
		System.out.println("a = "+a);
		
	}
}
