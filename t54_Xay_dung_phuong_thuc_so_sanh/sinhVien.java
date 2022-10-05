package t54_Xay_dung_phuong_thuc_so_sanh;

public class sinhVien implements Comparable<sinhVien>
{
	private int maSinhVien;
	private String hoVaTen,
				   tenLop;
	private double diemTrungBinh;
	public sinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) 
	{
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}
	public int getMaSinhVien() 
	{
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) 
	{
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) 
	{
		this.hoVaTen = hoVaTen;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) 
	{
		this.tenLop = tenLop;
	}
	public double getDiemTrungBinh() 
	{
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) 
	{
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public String getName(String s)
	{
		s.trim();
		if(s.indexOf(" ") >= 0 )
		{
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		}
		else 
		{
			return s;
		}
	}
	@Override
	public int compareTo(sinhVien o) 
	{
		//return maSinhVien - o.maSinhVien;
		String ten1 = getName(hoVaTen);
		String ten2 = getName(o.hoVaTen);
		
		return ten1.compareTo(ten2);
	}
	@Override
	public String toString() 
	{
		return "sinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", tenLop=" + tenLop + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}
	
	
}
