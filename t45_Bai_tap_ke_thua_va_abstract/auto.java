package t45_Bai_tap_ke_thua_va_abstract;

public class auto extends phuongTienDiChuyen
{
	private String loaiNhienLieu;

	public auto(hangSanXuat hsx, String loaiNhienLieu) 
	{
		super("Auto", hsx);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() 
	{
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) 
	{
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() 
	{
		return 60;
	}
	
}
