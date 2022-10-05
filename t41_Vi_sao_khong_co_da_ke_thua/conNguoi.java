package t41_Vi_sao_khong_co_da_ke_thua;

public class conNguoi {
	protected String name;
	protected int namSinh;
	public conNguoi(String name, int namSinh) 
	{
		this.name = name;
		this.namSinh = namSinh;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getNamSinh() 
	{
		return namSinh;
	}
	public void setNamSinh(int namSinh) 
	{
		this.namSinh = namSinh;
	}
	public void an()
	{
		System.out.println("mam mam");
	}
	public void ngu()
	{
		System.out.println("kho kho");
	}
}
