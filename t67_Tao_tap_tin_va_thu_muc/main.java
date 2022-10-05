package t67_Tao_tap_tin_va_thu_muc;

import java.io.File;
import java.io.IOException;

public class main {
	public static void main(String[] args) 
	{
		//Lưu ý:
		//MS Windows: \
		//Linux, macOS: /
		
		//Kiểm tra xem thư mục tập tin có tồn tại hay không
		File folder1 = new File("D:\\Temp\\Dragonboy_vn_v204");
		
		System.out.println("Folder1 tồn tại: " + folder1.exists());
		
		//Tạo thư mục
		//Phương thức mkdir()
		File d1 = new File("D:\\Temp\\Dragonboy_vn_v204\\directory_1");
		d1.mkdir();
		System.out.println("Folder1 tồn tại: " + d1.exists());
		
		//Tạo nhiều thư mục: mkdirs()
		File d2 = new File("D:\\Temp\\Dragonboy_vn_v204\\directory_1\\directory_2\\directory_3");
		d2.mkdirs();
		
		//Tạo tập tin
		File file1 = new File("D:\\\\Temp\\\\Dragonboy_vn_v204\\\\directory_1\\vidu_1.txt");
		try 
		{
			file1.createNewFile();
		} 
		catch (IOException e) 
		{
			//Không có quyền tạo tập tin
			//Ổ cứng bị đầy
			//Đường dẫn sai
			e.printStackTrace();
		}
		
	}
}
