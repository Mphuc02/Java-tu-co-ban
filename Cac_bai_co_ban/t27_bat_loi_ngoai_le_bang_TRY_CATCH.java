package Cac_bai_co_ban;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class t27_bat_loi_ngoai_le_bang_TRY_CATCH {
	public static void Bat_loi()
	{
		Scanner sc = new Scanner(System.in);
		int n=0;
		try
		{
			System.out.println("Nhap n:");
			n = sc.nextInt();
		}
		catch (Exception e) 
		{
			System.out.println("Du lieu khong dung!");
		}
		finally 
		{
			System.out.println("Dù có lỗi hay không thì chương trình vẫn chạy dòng lệnh này!");
		}
		System.out.println("So ban vua nhap la: "+ n);
		System.out.println("Ket thuc chuong trinh!");
	}
}	