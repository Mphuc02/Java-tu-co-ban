package t46_Phuong_thuc_interface;

public class main {
	public static void main(String[] args) 
	{
		System.out.println("Cau a:");
		
		mayTinhBoTuiInterface mt1 = new mayTinhCasio();
		//tuong duong mayTinhCasio mt1 = new mayTinhCasio();
		
		System.out.println(mt1.chia(4, 5));
		
		//1 class có thể interface được nhiều class khác, không như kế thừa
	}
}
