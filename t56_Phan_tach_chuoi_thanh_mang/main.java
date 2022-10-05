package t56_Phan_tach_chuoi_thanh_mang;

import java.util.Arrays;

public class main 
{
	public static void main(String[] args) 
	{
		String s = "Dinh Minh Phuc";
		
		String a[] = s.split(" ");
		System.out.println(Arrays.toString(a));
		
		String S = "Xin chao, cho bo may xin cai dia chi. thang oat con";
		String b[] = S.split("\\.|\\,");
		for(String i : b)
		{
			i = i.trim();//Bỏ các khoảng trắng ở đầu và cuối
			System.out.println(i);
		}
		
		String s2 = "Nguyen Van A";
		String hoTen[] = s2.split(" ");
		System.out.println("Ten cua s2: " + hoTen[hoTen.length - 1] );
		
		
	}
}
