package t35_quan_ly_sach;

public class tacGia {
	private String tenTacGia;
	private ngay ngaySinh;
	
	public tacGia(String name, ngay Ngay)
	{
		tenTacGia = name;
		ngaySinh = Ngay;
	}

	public String getTenTacGia() 
	{
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) 
	{
		this.tenTacGia = tenTacGia;
	}

	public ngay getNgaySinh() 
	{
		return ngaySinh;
	}

	public void setNgaySinh(ngay ngaySinh) 
	{
		this.ngaySinh = ngaySinh;
	}
	
	
}
