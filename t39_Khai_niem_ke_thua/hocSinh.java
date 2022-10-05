package t39_Khai_niem_ke_thua;

public class hocSinh extends conNguoi {
	private String tenLop, tenTruongString;

	public hocSinh(String hovaTen, int namSinh, String tenLop, String tenTruongString) 
	{
		super(hovaTen, namSinh);
		this.tenLop = tenLop;
		this.tenTruongString = tenTruongString;
	}

	public String getTenLop() 
	{
		return tenLop;
	}

	public void setTenLop(String tenLop) 
	{
		this.tenLop = tenLop;
	}

	public String getTenTruongString() 
	{
		return tenTruongString;
	}

	public void setTenTruongString(String tenTruongString) 
	{
		this.tenTruongString = tenTruongString;
	}
	public void lamBaiTap()
	{
		System.out.println("kho vai beep");
	}
	
}
