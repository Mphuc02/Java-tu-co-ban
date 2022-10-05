package t41_Vi_sao_khong_co_da_ke_thua;

public class main {
	public static void main(String[] args) 
	{
		nguoiVN nam = new nguoiVN("Nam", 2002);
		nam.an();
		nam.ngu();
		nam.XinChao();
		
		nguoiMy davidMy = new nguoiMy("david", 2003);
		davidMy.XinChao();
		
		baLon dogBaLon = new baLon("shit", 2021);
		dogBaLon.XinChao();
	}
}
