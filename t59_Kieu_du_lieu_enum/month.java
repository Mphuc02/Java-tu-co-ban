package t59_Kieu_du_lieu_enum;

public enum month 
{
	tháng_1(31),
	tháng_2(29),
	tháng_3(31),
	tháng_4(30),
	tháng_5(31);
	
	private final int soNgay;
	month(int s)
	{
		soNgay = s;
	}
	public int soNgay()
	{
		return soNgay;
	}
}
