package t36_quan_ly_bo_phim;

public class boPhim 
{
	private String tenPhim;
	int namSanXuat;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private Ngay ngayChieuNgay;
	public boPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieuNgay) 
	{
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieuNgay = ngayChieuNgay;
	}
	public String getTenPhim() 
	{
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) 
	{
		this.tenPhim = tenPhim;
	}
	public int getNamSanXuat() 
	{
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) 
	{
		this.namSanXuat = namSanXuat;
	}
	public HangSanXuat getHangSanXuat() 
	{
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) 
	{
		this.hangSanXuat = hangSanXuat;
	}
	public double getGiaVe() 
	{
		return giaVe;
	}
	public void setGiaVe(double giaVe) 
	{
		this.giaVe = giaVe;
	}
	public Ngay getNgayChieuNgay() 
	{
		return ngayChieuNgay;
	}
	public void setNgayChieuNgay(Ngay ngayChieuNgay) 
	{
		this.ngayChieuNgay = ngayChieuNgay;
	}
	
}
