package t97_Hien_thi_cua_so_thong_bao;

public class ThucDonModel 
{
	private String luaChon;
	private double tongTien;
	
	public ThucDonModel()
	{
		this.luaChon = "";
		this.tongTien = 0;
	}

	public String getLuaChon() 
	{
		return luaChon;
	}

	public void setLuaChon(String luaChon) 
	{
		this.luaChon = luaChon;
	}

	public double getTongTien() 
	{
		return tongTien;
	}

	public void setTongTien(double tongTien) 
	{
		this.tongTien = tongTien;
	}
	
}
