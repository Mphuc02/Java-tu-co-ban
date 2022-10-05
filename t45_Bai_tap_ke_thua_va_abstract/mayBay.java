package t45_Bai_tap_ke_thua_va_abstract;

public class mayBay extends phuongTienDiChuyen
{
	private String loaiNhienLieu;

	
	public mayBay(hangSanXuat hsx, String loaiNhienLieu) 
	{
		super("May bay", hsx);
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
		return 500;
	}
	
	public void catCanh()
	{
		System.out.println("Cat canh");
	}
	
	public void haCanh()
	{
		System.out.println("Ha canh");
	}
	
}
