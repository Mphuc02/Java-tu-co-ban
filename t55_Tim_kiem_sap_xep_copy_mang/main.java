package t55_Tim_kiem_sap_xep_copy_mang;

import java.util.Arrays;

import t54_Xay_dung_phuong_thuc_so_sanh.sinhVien;

public class main 
{
	public static void main(String[] args) 
	{
		int a[] = new int[] {4,1,2,5,8,7,5};
		int b[] = new int[15];
		
		//Hàm sắp xếp
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//Hàm tìm kiếm 
		System.out.println(Arrays.binarySearch(a, 4));
		
		//Hàm điền giá trị
		//Điền đến khi nào đủ phần tử
		Arrays.fill(b, 5);
		System.out.println(Arrays.toString(b));
		
		sinhVien sv1 = new sinhVien(1, "Minh Phuc", "CN11-B", 4.0);
		sinhVien sv2 = new sinhVien(2, "Viet Tung", "CN5-B", 3.5);
		sinhVien sv3 = new sinhVien(3, "Xuan Son", "MR1-B", 3.6);
		
		sinhVien a_sVien[] = new sinhVien[] {sv1,sv2,sv3};
		System.out.println(Arrays.toString(a_sVien));
		
		//Hàm sắp xếp
		Arrays.sort(a_sVien);
		System.out.println(Arrays.toString(a_sVien));
		//Phải có hàm compareTo
		
		//Hàm tìm kiếm
		System.out.println(Arrays.binarySearch(a_sVien, sv1 ));
	}
}
