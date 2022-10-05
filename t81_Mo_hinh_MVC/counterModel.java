package t81_Mo_hinh_MVC;

import t48_Phan_biet_dieu_khien_Public_Protected_Private.infor;

public class counterModel 
{
	private int value;

	public counterModel() 
	{
		this.value = 0;
	}

	public int getValue() 
	{
		return value;
	}

	public void setValue(int value) 
	{
		this.value = value;
	}
	
	public void INC()
	{
		this.value++;
	}
	
	public void DESC()
	{
		this.value--;
	}
	
	public void Reset()
	{
		this.value = 0;
	}
}
