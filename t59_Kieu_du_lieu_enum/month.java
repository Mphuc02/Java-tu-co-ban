package t59_Kieu_du_lieu_enum;

public enum month 
{
	th�ng_1(31),
	th�ng_2(29),
	th�ng_3(31),
	th�ng_4(30),
	th�ng_5(31);
	
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
