package t49_Xu_ly_chuoi;

import java.util.Scanner;

public class main {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name = null;
		System.out.print("Nhap name: ");
		name = "Dinh Minh Phuc";
		System.out.println(name);
		
		//Hàm length => lấy độ dài chuỗi
		for(int i = 0;i<name.length();i++)
			System.out.print(name.charAt(i));
		System.out.println("");
		
		//Hàm getchars(Vị trí bắt đầu, vị trí kết thúc, mảng lưu dữ liệu, vị trí bắt đầu lưu của mảng)
		char arrayChar[] = new char[100];
		name.getChars(2, 4, arrayChar, 0);//Lấy phần tử vị trí [2,4) và gán vào vị trí thứ 0 của arrayChar
		System.out.println(arrayChar);
		
		//Hàm equals so sánh 2 chuỗi giống nhau
		String s1 = "Phuc";
		String s2 = "phuc";
		String s3 = "phuc";
		System.out.println("S1 giong S2: " + s1.equals(s2));
		System.out.println("s2 giong s3: " + s2.equals(s3));
		
		//Hàm equalsIgnoreCase: không biệt chữ hoa chữ thường
		System.out.println("S1 giong S2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s2 giong s3: " + s2.equalsIgnoreCase(s3));
		
		//Hàm compareTo: So sánh < > = 
		/*
		 * Nếu giá trị trả về < 0 thì a < b
		 * Nếu giá trị trả về = 0 thì a = b
		 * Nếu giá trị trả về > 0 thì a > b
		 */
		String a = "abcd";
		String b = "cde";
		String c = "abcd";
		System.out.println("a > b :" + a.compareTo(b));
		System.out.println("a = c : " + a.compareTo(c));
		//CompareToIgnoreCase so sánh không phân biệt chữ hoa, chũ thường
		
		//hàm regionMatches: So sánh 1 đoạn
		String a1 = "TITV.vn";
		String a2 = "TV.v";
		
		boolean check = a1.regionMatches(2, a2, 0, 4);	
		/*
		 *Bắt đầu từ vị trí 2 của a1
		 *chuỗi a2 dùng để so sánh
		 *bắt đầu từ vị trí 0 của a2
		 *So sánh 4 ký tự
		 */
		System.out.println(check);
		
		//Hàm startsWith: Hàm kiểm tra chuỗi bắt đầu bằng 1 chuỗi khác
		String sdt = "0382988655";
		System.out.println("sdt bắt đàu = 038 " + sdt.startsWith("038"));
		//Hàm endWith: giống startsWith nhưng là kiểm tra kết thúc
		
		//Hàm indexOf
		s1 = "xin chao may thang moi den, Xin chao, xin chao";
		s2 = "xin chao";
		s3 = "xin chao 123";
		System.out.println("s2 xuat hien trong s1: vi tri bat dau: " + s1.indexOf(s2));
		System.out.println("s3 xuat hien trong s1: vi tri bat dau: " + s1.indexOf(s3));
		//Sử dụng vị trí bắt đầu
		System.out.println("s2 xuat hien trong s1: vi tri bat dau: " + s1.indexOf(s2,2	));
		
		//Tim kiem char
		char o = 'o';
		System.out.println("o xuat hien trong s1 tai vi tri: " + s1.indexOf(o));
		System.out.println("o xuat hien trong s1 tai vi tri: " + s1.indexOf(o,8));
		
		//lastIndexOf: tìm kiếm từ phải sang trái
		
		//Hàm nốt chuỗi
		s3 = s1 + s2;
		String s4 = s1.concat(s2);
		System.out.println("s3: " + s3 + "\ns4:" + s4);
		
		//Hàm replace: Thay thế 1 chuỗi bằng 1 chuỗi khác
		s1 = s1.replace("xin", "cho");
		System.out.println(s1);
		
		//Ham toLowerCase
		s3 = s3.toLowerCase();
		System.out.println(s3);
		s3 = s3.toUpperCase();
		System.out.println(s3);
		
		//Xoá khoảng trắng dư thừa
		String s5 = "   Địt mẹ lũ gay lọ     ";
		System.out.println(s5.trim());
		
		//subString: Cắt chuỗi con
		s5 = s5.substring(10); // cắt chuỗi từ vị trí số 10
		System.out.println(s5);
		
	}
}
