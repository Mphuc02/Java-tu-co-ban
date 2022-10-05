package t36_quan_ly_bo_phim;

public class Ngay {
	private int ngay,
				thang,
				nam;
	public Ngay(int d , int m ,int y) 
	{
		ngay = d;
		thang = m;
		nam = y;
	}
	public int getNgay() 
	{
		return ngay;
	}
	public void setNgay(int ngay) 
	{
		this.ngay = ngay;
	}
	public int getThang() 
	{
		return thang;
	}
	public void setThang(int thang) 
	{
		this.thang = thang;
	}
	public int getNam() 
	{
		return nam;
	}
	public void setNam(int nam) 
	{
		this.nam = nam;
	}
	
}
