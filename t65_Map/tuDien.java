package t65_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class tuDien 
{
	private Map<String, String> duLieu = new TreeMap<String, String>();
	
	public String themTu(String tuKhoa,String yNghia)
	{
		return duLieu.put(tuKhoa, yNghia);
	}
	
	public String xoaTu(String tuKhoa)
	{
		return duLieu.remove(tuKhoa);
	}
	
	public String traTu(String tuKhoa)
	{
		return duLieu.get(tuKhoa);
	}
	
	public void inTuKhoa() 
	{
		Set<String>tapHopTuKhoa = duLieu.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}
	
	public int laySoLuong()
	{
		return duLieu.size();
	}
	
	public void xoaTatCa()
	{
		duLieu.clear();
	}
	
	public static void main(String[] args) 
	{
		tuDien td = new tuDien();
		Scanner sc = new Scanner(System.in);
		chuongtrinh:while(true)
		{
			System.out.println("-----MENU-----"
							 + "1.Thêm từ\n"
							 + "2.Xoá từ\n"
							 + "3.Tìm ý nghĩa của từ khoá\n"
							 + "4.In ra danh sách từ khoá\n"
							 + "5.in ra số lượng từ\n"
							 + "6.Xoá tất cả các từ khoá\n"
							 + "0.Kết thúc chương trình");
			int luaChon = sc.nextInt();
			sc.nextLine();
			switch (luaChon)
			{
				case 0:
					break chuongtrinh;
				case 1:
					System.out.println("Nhập từ khoá:");
					String tuKhoa = sc.nextLine();
					System.out.println("Nhập ý nghĩa: ");
					String yNghia = sc.nextLine();
					td.themTu(tuKhoa, yNghia);
					break;
				case 2:
					System.out.println("Nhập từ khoá:");
					tuKhoa = sc.nextLine();
					td.xoaTu(tuKhoa);
					break;
				case 3:
					tuKhoa = sc.nextLine();
					System.out.println("Y nghia la: " + td.traTu(tuKhoa));
					break;
				case 4:
					td.inTuKhoa();
					break;
				case 5:
					System.out.println("So luong tu khoa: " + td.laySoLuong());
					break;
				case 6:
					td.xoaTatCa();
					break;
			}
		}
	}
}
