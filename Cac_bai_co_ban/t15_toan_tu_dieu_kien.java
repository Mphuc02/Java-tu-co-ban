package Cac_bai_co_ban;

import java.util.Scanner;
public class t15_toan_tu_dieu_kien {
	public static void so_sanh()
	{
		Scanner bp = new Scanner(System.in);
		while(true)
		{
			System.out.println("Nhap a:");
			int a=bp.nextInt();
			String kq = (a%2==0) ? "So chan" : "So le";
			System.out.println(kq);
		}
	}
}
