package t44_Lop_va_phuong_thuc_truu_tuong;

public class hinhTron extends hinh
{
	private double r;
	
	public hinhTron(toaDo toado, double R) 
	{
		super(toado);
		r=R;
	}
	
	public double getR() 
	{
		return r;
	}
	public void setR(double r) 
	{
		this.r = r;
	}

	@Override
	public double tinhDienTich() 
	{
		return Math.PI * r * r;
	}
}
