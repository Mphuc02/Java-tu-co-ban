package t48_Phan_biet_dieu_khien_Public_Protected_Private;

public class infor 
{
	private int a; //Chỉ có thể sử dụng trong class cha, các class con muốn sử dụng phải thông qua super hoặc các hàm setter
	int b; // Chỉ sử dụng được trong 1 class con tong cùng 1 package
	protected int c; // tất cả các class con đều sử dụng đc
	public int d;
	
	public void method()
	{
		a = 1;
	}
}
