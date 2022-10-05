package t45_Bai_tap_ke_thua_va_abstract;

public class xeDap extends phuongTienDiChuyen
{

	public xeDap(hangSanXuat hsx) 
	{
		super("Xe dap", hsx);
	}

	@Override
	public double layVanToc() 
	{
		return 10;
	}
	
}
