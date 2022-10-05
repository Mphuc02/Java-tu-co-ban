package t78_Cua_so_frame;


import javax.swing.JFrame;

public class main {
	public static void main(String[] args) 
	{
		//Những phương thức cơ bản
//		JFrame() : Tạo 1 JFrame
//		setVisible(boolean a): ẩn, hiện jFrame
//		setTitle(String title): gắn tên cho Jframe
//		setSize(int width, int height): gán kích cỡ cho jFrame
//		setLocation(int horizontal, int vertical): vị trí hiện thị
//		pack(): đóng gói
//		setDefaultCloseOperation(int operation): Quy định điều khiển khiển đóng
		
		JFrame jf = new JFrame();
		jf.setSize(600,400);
		jf.setTitle("Ví dụ JFrame");
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);//Nếu tắt cửa sổ JFrame thì sẽ ngừng chương trình
		jf.setLocation(300, 300);//set vị trí xuất hiện của cửa sổ chương trình
		jf.setVisible(true);//Hiển thị cửa sổ chương trình
		
		myWindow m1 = new myWindow();
		m1.Show();
	}
}
