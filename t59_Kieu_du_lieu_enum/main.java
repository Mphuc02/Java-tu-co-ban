package t59_Kieu_du_lieu_enum;

public class main 
{
	public static void main(String[] args) 
	{
		thoiKhoaBieu tkb = new thoiKhoaBieu(day.monday, "Toan Ly Hoa");
		thoiKhoaBieu tkb2 = new thoiKhoaBieu(day.thursday, "Sinh Van Su");
		System.out.println(tkb);
		
		int a = month.tháng_1.soNgay();
		System.out.println(a);
	}
}
