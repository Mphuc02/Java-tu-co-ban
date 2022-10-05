package Cac_bai_co_ban;


public class t30_Xaydung_class_va_khoi_tao {
	private int  day, month , year;
	
	public t30_Xaydung_class_va_khoi_tao(int d, int m ,int y)
	{
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public void PrintDay()
	{
		System.out.println("Day: " + this.day);
	}
	public void PrintMonth()
	{
		System.out.println("Month: " + this.month);
	}
	public void PrintYear()
	{
		System.out.println("Year: " + this.year);
	}
	public void PrintDate()
	{
		System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
	}
}