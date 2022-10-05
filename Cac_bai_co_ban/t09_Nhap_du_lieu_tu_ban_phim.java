package Cac_bai_co_ban;
import java.util.Scanner;
public class t09_Nhap_du_lieu_tu_ban_phim {
	public static void Nhap_du_lieu()
	{
		Scanner sc = new Scanner(System.in);//Khai bao lop scanner de nhap du lieu
		System.out.print("Ten ong chau la gi ?");
		String hoten = sc.nextLine();
		System.out.print("Ong chau bao nhieu tuoi: ");
		int tuoi = sc.nextInt();
		System.out.println("Ten ong chau la "+ hoten + ", ong chau "+ tuoi+" mua khoai xo roi dung khong ?");
		sc.close();
	}
}
