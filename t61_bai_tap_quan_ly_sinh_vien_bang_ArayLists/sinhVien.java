package t61_bai_tap_quan_ly_sinh_vien_bang_ArayLists;

import java.io.Serializable;

import javax.annotation.processing.RoundEnvironment;

public class sinhVien implements Comparable<sinhVien>,Serializable
{
	private String maSV,
				   hoVaTen,
				   namSinh;
	private double GPA;
	
	public sinhVien()
	{
		
	}
	public sinhVien(String maSV, String hoVaTen, String namSinh, double gPA) 
	{
		this.maSV = maSV;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		GPA = gPA;
	}
	public String getMaSV() 
	{
		return maSV;
	}
	public void setMaSV(String maSV) 
	{
		this.maSV = maSV;
	}
	public String getHoVaTen() 
	{
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) 
	{
		this.hoVaTen = hoVaTen;
	}
	public String getNamSinh() 
	{
		return namSinh;
	}
	public void setNamSinh(String namSinh) 
	{
		this.namSinh = namSinh;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) 
	{
		GPA = gPA;
	}
	
	@Override
	public String toString() 
	{
		return "sinhVien [maSV=" + maSV + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", GPA=" + Math.round(GPA * 100.0)/100.0  + "]";
	}
	
	@Override
	public int compareTo(sinhVien o) 
	{
		return maSV.compareTo(o.maSV);
	}
	
}
