package t35_quan_ly_sach;

public class Sach 
{
	private String tenSach;
	private double giaban;
	private int namXuatBan;
	private tacGia tacGia;
	public Sach(String tenSach, double giaban, int namXuatBan, t35_quan_ly_sach.tacGia tacGia) 
	{
		this.tenSach = tenSach;
		this.giaban = giaban;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
	}
	public String getTenSach() 
	{
		return tenSach;
	}
	public void setTenSach(String tenSach) 
	{
		this.tenSach = tenSach;
	}
	public double getGiaban() 
	{
		return giaban;
	}
	public void setGiaban(double giaban) 
	{
		this.giaban = giaban;
	}
	public int getNamXuatBan() 
	{
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) 
	{
		this.namXuatBan = namXuatBan;
	}
	public tacGia getTacGia() 
	{
		return tacGia;
	}
	public void setTacGia(tacGia tacGia) 
	{
		this.tacGia = tacGia;
	}
	
	public void InTenSach()
	{
		System.out.println("Ten sach: " + tenSach);
	}
}
