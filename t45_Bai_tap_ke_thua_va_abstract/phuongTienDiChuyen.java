package t45_Bai_tap_ke_thua_va_abstract;

public abstract class phuongTienDiChuyen 
{
	protected String tenLoaiPhuongien;
	protected hangSanXuat hsx;
	

	public phuongTienDiChuyen(String tenLoaiPhuongien, hangSanXuat hsx) 
	{
		super();
		this.tenLoaiPhuongien = tenLoaiPhuongien;
		this.hsx = hsx;
	}

	public String getTenLoaiPhuongien() 
	{
		return tenLoaiPhuongien;
	}

	public void setTenLoaiPhuongien(String tenLoaiPhuongien) 
	{
		this.tenLoaiPhuongien = tenLoaiPhuongien;
	}
	
	public String layTenHangSanXuat()
	{
		return this.hsx.getTenHangSanXuat();
	}
	
	public void batDau()
	{
		System.out.println("Khoi dong dong co");
	}
	
	public void tangToc()
	{
		System.out.println("Tang toc");
	}
	
	public void dungLai()
	{
		System.out.println("Dung lai");
	}
	
	public abstract double layVanToc();
}
