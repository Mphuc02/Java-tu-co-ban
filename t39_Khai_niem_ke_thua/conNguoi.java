package t39_Khai_niem_ke_thua;

public class conNguoi {
	private String hovaTen;
	private int NamSinh;
	public conNguoi(String hovaTen, int namSinh) 
	{
		this.hovaTen = hovaTen;
		NamSinh = namSinh;
	}
	public String getHovaTen() 
	{
		return hovaTen;
	}
	public void setHovaTen(String hovaTen) 
	{
		this.hovaTen = hovaTen;
	}
	public int getNamSinh() 
	{
		return NamSinh;
	}
	public void setNamSinh(int namSinh) 
	{
		NamSinh = namSinh;
	}
	
	public void an()
	{
		System.out.println("nhuom nham");
	}
	
	public void uong()
	{
		System.out.println("Uc");
	}
	
	public void ngu()
	{
		System.out.println("kho kho");
	}
	
}
