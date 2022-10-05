package t85_Su_dung_JTextArea;

public class TimKiemModel 
{
	private String vanBan = "",
				   tuKhoa = "",
				   ketQua = "";

	public TimKiemModel() 
	{
		
	}

	public String getVanBan() 
	{
		return vanBan;
	}

	public void setVanBan(String vanBan) 
	{
		this.vanBan = vanBan;
	}

	public String getTuKhoa() 
	{
		return tuKhoa;
	}

	public void setTuKhoa(String tuKhoa) 
	{
		this.tuKhoa = tuKhoa;
	}

	public String getKetQua() 
	{
		return ketQua;
	}

	public void setKetQua(String ketQua) 
	{
		this.ketQua = ketQua;
	}
	
	public void timKiem()
	{
		int dem = 0,
			viTri = 0;
		while(true)
		{
			int i = vanBan.indexOf(tuKhoa, viTri);
			if(i == -1)
				break;
			else 
			{
				dem++;
				viTri = i + 1;
			}
			
		}
		this.ketQua = "Ket qua co: " + dem + " " + tuKhoa;
	}
}
