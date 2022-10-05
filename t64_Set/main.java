package t64_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class main 
{
	Set<String> phieuDuThuong = new HashSet<String>();
	
	public main() 
	{

	}

	public boolean option1(String giaTri)
	{
		return phieuDuThuong.add(giaTri);
	}
	
	public boolean option2(String giaTri)
	{
		return phieuDuThuong.remove(giaTri);
	}
	
	public boolean option3(String giaTri)
	{
		return phieuDuThuong.contains(giaTri);
	}
	
	public void option4()
	{
		phieuDuThuong.clear();
	}
	
	public int option5()
	{
		return phieuDuThuong.size();
	}
	
	public String option6()
	{
		Random rd = new Random();
		int vitri = rd.nextInt(phieuDuThuong.size());
		return (String) phieuDuThuong.toArray()[vitri];
 	}
	public void option7()
	{
		System.out.println(Arrays.toString(phieuDuThuong.toArray()));
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		main rt = new main();
		rutTham: while(true)
		{
			System.out.println("----Menu----\n"
							 + "1.Thêm mã dự thưởng\n"
							 + "2.Xoá mã dự thưởng\n"
							 + "3.Kiểm tra mã số dự thưởng có tồn tại hay không\n"
							 + "4.Xoá tất cả phiếu dự thưởng\n"
							 + "5.Số lượng phiếu dự thưởng\n"
							 + "6.Rút thăm\n"
							 + "7.In ra tất cả các mã\n"
							 + "0.Thoát khỏi chương trình");
			int luaChon = sc.nextInt();
			sc.nextLine();
			String maDuThuong = "";
			if(luaChon == 1 || luaChon == 2 || luaChon == 3)
			{
				System.out.println("Nhập mã dự thưởng: ");
				maDuThuong = sc.nextLine();
			}
			switch (luaChon)
			{
				case 0:
					break rutTham;
				case 1:
					rt.option1(maDuThuong);
					break;
				case 2:
					rt.option2(maDuThuong);
					break;
				case 3:
					System.out.println("Kết quả kiểm tra: " + rt.option3(maDuThuong));
					break;
				case 4:
					rt.option4();
					break;
				case 5:
					System.out.println("Số lượng phiếu là: "+ rt.option5());
					break;
				case 6:
					System.out.println("Mã số trúng thưởng là: " + rt.option6());
					break;
				case 7:
					System.out.println("Tất cả mã dự thưởng: " );
					rt.option7();
					break;
			}
		}
	}
}
