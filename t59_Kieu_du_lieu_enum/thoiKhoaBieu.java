package t59_Kieu_du_lieu_enum;

public class thoiKhoaBieu 
{
	
	private day thu;
	private String cacMonHoc;
	public thoiKhoaBieu(day thu, String cacMonHoc) 
	{
		this.thu = thu;
		this.cacMonHoc = cacMonHoc;
	}
	public day getThu() 
	{
		return thu;
	}
	public void setThu(day thu)
	{
		this.thu = thu;
	}
	public String getCacMonHoc() 
	{
		return cacMonHoc;
	}
	public void setCacMonHoc(String cacMonHoc) 
	{
		this.cacMonHoc = cacMonHoc;
	}
	
	@Override
	public String toString() {
		return "thoiKhoaBieu [thu=" + thu + ", cacMonHoc=" + cacMonHoc + "]";
	}
}
