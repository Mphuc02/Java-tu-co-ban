package t35_quan_ly_sach;

public class main 
{
	public static void main(String[] args) 
	{
		ngay ngay1 = new ngay(15, 5, 2021);
		ngay ngay2 = new ngay(24, 5, 2002);
		
		tacGia tg1 = new tacGia("Minh Phuc", ngay1);
		tacGia tg2 = new tacGia("Dinh Phuc", ngay2);
		
		Sach sach1 = new Sach("thanh thao java trong 30 phut", 5000, 2023, tg1);
		sach1.InTenSach();
	}
}
