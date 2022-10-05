package Cac_bai_co_ban;
import java.util.Scanner;
public class t27a_Mang_trong_java {
	public static void Mang()
	{
		Scanner scanner = new Scanner(System.in);
		
		//Có 2 cách khai báo mảng
		//Cách 1:
		double[] mang1;
		//Cách 2
		double mang2[];
		
		mang1 = new double[20];
		
		for(int i = 0;i<mang1.length;i++)
		{
			System.out.println("mang[" + i +"]: ");
			mang1[i]=scanner.nextDouble();
		}
		mang2 = new double[] {1,2,3,4,5};
		for(int i = 0;i<mang2.length;i++)
		{
			System.out.println("mang2[" + i +"] =" + mang2[i]);
		}
	}
}
