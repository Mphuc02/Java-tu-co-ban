package t46_Phuong_thuc_interface;

public class mayTinhCasio implements mayTinhBoTuiInterface
{

	@Override
	public double cong(double a, double b) 
	{	
		return a+b;
	}
	@Override
	public double tru(double a, double b) 
	{
		return a-b;
	}
	
	@Override
	public double nhan(double a, double b) 
	{	
		return a*b;
	}

	@Override
	public double chia(double a, double b) 
	{
		return a/b;
	}

	
	
}
