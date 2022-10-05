package t57_Bai_tap_su_dung_Random_NumberFormat;

import java.util.Random;
import java.util.Scanner;

import javax.swing.ButtonGroup;

import t42_Ghi_de_phuong_thuc.dog;

public class main 
{
	public static void main(String[] args) 
	{
		double taiKhoanNguoiChoi = 5000;
		int luaChon = 1;
		Scanner scanner = new Scanner(System.in);
		do 
		{
			System.out.println("----------Có cái con cặc----------");
			System.out.println("1.Còn thở là còn gỡ");
			System.out.println("Chọn phím bất kỳ để thoát");
			luaChon = scanner.nextInt();
			if(luaChon == 1)
			{
				System.out.println("Số nịt còn lại: " + taiKhoanNguoiChoi );
				double datCuoc = 0;
				do		
				{
					System.out.println("Bạn muốn cược bao nhiêu: ");
					datCuoc= scanner.nextDouble();
				}while(datCuoc > taiKhoanNguoiChoi && datCuoc <= 0);
				
				int luaChonTaiXiu = 1;
				do
				{
					System.out.println("Mời bạn chọn tài hoặc xỉu:\n1.Tài\n2.Xỉu");
					luaChonTaiXiu = scanner.nextInt();
				}while(luaChonTaiXiu != 1 && luaChonTaiXiu!= 2);
				
				//Tung xúc xắc
				Random xucXac1 = new Random(),
					   xucXac2 = new Random(),
					   xucXac3 = new Random();
				
				int kq1 = xucXac1.nextInt(1,7),
					kq2 = xucXac2.nextInt(1,7),
					kq3 = xucXac3.nextInt(1,7);
				
				//Tính toán kết quả
				int ketQua = kq1 + kq2 + kq3;
				System.out.println("Kết quả:" + ketQua);
				if(ketQua == 3 || ketQua == 18)
				{
					taiKhoanNguoiChoi -= datCuoc;
					System.out.println("Nhà cái ăn hết, mày ngu lắm côn chó ạ\nTài khoản bị trừ đi " + datCuoc + "\nTai khoản của bạn là: " + taiKhoanNguoiChoi);
				}
				else if(ketQua >= 4 && ketQua <=10 && luaChonTaiXiu == 2)
				{
					taiKhoanNguoiChoi -= datCuoc;
					System.out.println("Nhà cái ăn hết, mày ngu lắm côn chó ạ\nTài khoản bị trừ đi " + datCuoc + "\nTai khoản của bạn là: " + taiKhoanNguoiChoi);
				}
				else if( ketQua >= 11 && ketQua <18 && luaChonTaiXiu == 1)
				{
					taiKhoanNguoiChoi -= datCuoc;
					System.out.println("Nhà cái ăn hết, mày ngu lắm côn chó ạ\nTài khoản bị trừ đi " + datCuoc + "\nTai khoản của bạn là: " + taiKhoanNguoiChoi);
				}
				else 
				{
					taiKhoanNguoiChoi += datCuoc;
					System.out.println("Chúc mừng\nThưởng: " + datCuoc + "\nTài khoản hiện tại: " + taiKhoanNguoiChoi);
				}
			}
		} 
		while (luaChon == 1);
	}
}
