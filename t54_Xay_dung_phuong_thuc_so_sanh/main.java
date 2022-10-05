package t54_Xay_dung_phuong_thuc_so_sanh;

public class main 
{	
	public static void main(String[] args) 
	{
		sinhVien sv1 = new sinhVien(1, "Minh Phuc", "CN11-B", 4.0);
		sinhVien sv2 = new sinhVien(2, "Viet Tung", "CN5-B", 3.5);
		System.out.println(sv1.compareTo(sv2));
	}
}
