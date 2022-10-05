package Cac_bai_co_ban;

public class t31_Phuong_thuc_trong_class 
{
	private String tenLoaiCaphe;
	private double GiaTien1Kg,
				   khoiLuong;
	
	public t31_Phuong_thuc_trong_class(String name , double gia , double kl)
	{
		tenLoaiCaphe = name;
		GiaTien1Kg = gia;
		khoiLuong = kl;
	}
	
	public double tinhTongTien()
	{
		return GiaTien1Kg * khoiLuong;
	}
	
	public boolean kiemTraKhoiLuongLonHon(double kl)
	{
		return khoiLuong>kl;
	}
	
}