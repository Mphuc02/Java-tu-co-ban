package Cac_bai_co_ban;

import java.util.Scanner;

public class t23_Vong_lap_while {
	public static void Vong_lap_while()
	{
		int x;
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("Nhap so x: ");
			x = scanner.nextInt();
			if(x == 0)
			{
				break;
			}
			System.out.println("Con cu bu cha ba!");
		}
	}
}
