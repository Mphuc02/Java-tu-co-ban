package test;

class SinhVien
{
	private String maSV,
				   hoTen,
				   soDT;

	public SinhVien(String maSV, String hoTen, String soDT) 
	{
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.soDT = soDT;
	}

	public String getMaSV() 
	{
		return maSV;
	}

	public String getHoTen() 
	{
		return hoTen;
	}

	public String getSoDT() 
	{
		return soDT;
	}
}

class BaiTap
{
	private String tenBT;
	
	private int soTT;
	
	private static int soLuongBT = 1;

	public BaiTap(String tenBT) 
	{
		this.soTT = soLuongBT++;
		this.tenBT = tenBT;
	}

	public String getTenBT() 
	{
		return tenBT;
	}

	public int getSoTT() 
	{
		return soTT;
	}
	
}

class Nhom implements Comparable<Nhom>
{
	private String maSV,
				   hoTen,
				   soDT,
				   tenBT;
	
	private int soTT;

	public Nhom(String maSV, int soTT) 
	{
		this.maSV = maSV;
		this.soTT = soTT;
	}

	public void setHoTen(String hoTen) 
	{
		this.hoTen = hoTen;
	}

	public void setSoDT(String soDT) 
	{
		this.soDT = soDT;
	}

	public void setTenBT(String tenBT) 
	{
		this.tenBT = tenBT;
	}

	@Override
	public int compareTo(Nhom o) 
	{
		return maSV.compareTo(o.maSV);
	}
	
	@Override
	public String toString()
	{
		return maSV + " " +
			   soDT + " " +
			   soTT + " " + 
			   tenBT;
	}
}

public class main
{
//	private static void ghiDuLieuXuongFile() throws IOException
//	{
//		OutputStream os = new FileOutputStream("D:\\Learning\\jav\\123\\src\\test\\DATA1.in");
//		ObjectOutputStream oos = new ObjectOutputStream(os);
//		ArrayList<Integer> arr = new ArrayList<>();
//		for(int i = 100000 ; i >= 1000 ;i--)
//			arr.add(i);
//		oos.writeObject(arr);
//		oos.flush();
//	}
	public static void main(String[] args)
	{
		new calculator();
	}
}