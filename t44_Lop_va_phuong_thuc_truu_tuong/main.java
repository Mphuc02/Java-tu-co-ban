package t44_Lop_va_phuong_thuc_truu_tuong;

import java.awt.print.Printable;

public class main {
	public static void main(String[] args) 
	{
		toaDo td1Do = new toaDo(2, 3);
		toaDo td2 = new toaDo(4, 5);
		
		//hinh h1 = new hinh(td1Dod) {};
		//khôg thể sử dụng cách này
		
		hinh h1 = new diem(td1Do);
		hinh h2 = new hinhTron(td2, 3);
		
		hinh h3 = new hinhCN(td2, 5, 6);
		
		System.out.println("Toa do cua h1:\nx = " + h1.getToado().x + "\ny = " + h1.getToado().y);
	}
}
