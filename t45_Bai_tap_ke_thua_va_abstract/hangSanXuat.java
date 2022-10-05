package t45_Bai_tap_ke_thua_va_abstract;

public class hangSanXuat 
{
	private String tenHangSanXuat, tenQuocGia;

	public hangSanXuat(String tenHangSanXuat, String tenQuocGia) 
	{
		this.tenHangSanXuat = tenHangSanXuat;
		this.tenQuocGia = tenQuocGia;
	}

	public String getTenHangSanXuat() 
	{
		return tenHangSanXuat;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) 
	{
		this.tenHangSanXuat = tenHangSanXuat;
	}

	public String getTenQuocGia() 
	{
		return tenQuocGia;
	}

	public void setTenQuocGia(String tenQuocGia) 
	{
		this.tenQuocGia = tenQuocGia;
	}
	
	
}
