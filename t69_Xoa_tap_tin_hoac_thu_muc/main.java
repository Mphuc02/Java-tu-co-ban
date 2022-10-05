package t69_Xoa_tap_tin_hoac_thu_muc;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class main 
{
	public static void xoaHetFile(File fx)
	{
		if(fx.isFile())
			fx.delete();
		else if(fx.isDirectory())
		{
			File mangCon[] = fx.listFiles();
			//Lấy các file con
			for(File FX : mangCon)
				xoaHetFile(FX);
			fx.delete(); 
		}
	}
	public static void main(String[] args) 
	{
		//Sử dụng class File
		File f0 = new File("C:\\Users\\Admin\\Desktop\\mp"); 
		File f1 = new File("C:\\Users\\Admin\\Desktop\\mp\\mp");
		f1.deleteOnExit();//Chỉ có thể xoá đc thư mục rỗng hoặc tập tin
		//f1.delete()//Sẽ trả về kết quả có hoặc không
     	xoaHetFile(f0);
		
		//Sử dụng class Files
		Path path = f1.toPath();
		try 
		{
			Files.deleteIfExists(path);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
}
