package t45_Bai_tap_ke_thua_va_abstract;

public class main {
	public static void main(String[] args) 
	{
		hangSanXuat h1 = new hangSanXuat("hang 1", "Viet Nam");
		hangSanXuat h2 = new hangSanXuat("Hang 2", "My");
		hangSanXuat h3 = new hangSanXuat("Hang 3", "Trung Quoc");
		
		phuongTienDiChuyen p1 = new mayBay(h1, "Dau diesel");
		phuongTienDiChuyen p2 = new auto(h2, "Xang");
		phuongTienDiChuyen p3 = new xeDap(h3);
		
		p1.layTenHangSanXuat();
		System.out.println("Van toc: " + p1.layVanToc());
		p1.batDau();
		
		System.out.println(p2.getTenLoaiPhuongien());
		p2.layTenHangSanXuat();
		p2.batDau();
		p2.dungLai();
		
		
	}
}
