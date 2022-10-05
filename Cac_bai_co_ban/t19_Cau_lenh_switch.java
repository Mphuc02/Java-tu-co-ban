package Cac_bai_co_ban;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthUI;

public class t19_Cau_lenh_switch {
	public static void SWITCH()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = scanner.nextInt();
		switch(n)
		{
			case 2:
			{
				System.out.println("Thu hai");
				break;
			}
			case 3:
			{
				System.out.println("Thu ba");
				break;
			}
			case 4:
			{
				System.out.println("Thu bon");
				break;
			}
			default:
				System.out.println("Luoi qua khong viet tiep");
		}
	}
}
