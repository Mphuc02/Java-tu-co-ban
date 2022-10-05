package t44_Lop_va_phuong_thuc_truu_tuong;

public abstract class hinh 
{
	//class trừu tượng có thể có cả phương thức không trừu tượng
	protected toaDo toado;

	public hinh(toaDo toado) 
	{
		super();
		this.toado = toado;
	}

	public toaDo getToado() 
	{
		return toado;
	}

	public void setToado(toaDo toado) 
	{
		this.toado = toado;
	}
	
	public abstract double tinhDienTich();
}
