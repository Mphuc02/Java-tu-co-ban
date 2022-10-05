package t70_Doi_ten_di_chuyen_coppy_file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class main {
	public void copyTatCa(File f1 , File f2)
	{
		try 
		{
			Files.copy(f1.toPath(), f2.toPath(),StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) 
		{
			// TODO: handle exception
		}
		if(f1.isDirectory())
		{
			File mangCon[] = f1.listFiles();
			for(File f : mangCon)
			{
				File fn = new File(f2.getAbsoluteFile() + "/" + f.getName());
				copyTatCa(f, fn);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		main vdfile = new main();
		File f0 = new File("C:\\Users\\Admin\\Desktop\\mp\\1.txt"); 
		File f1 = new File("C:\\Users\\Admin\\Desktop\\mp\\2.txt");
		File f3 = new File("C:\\Users\\Admin\\Desktop\\mp\\3.txt");
		
		//Đổi tên file
		/*f0.renameTo(f1);
		try 
		{
			Files.move(f1.toPath(), f3.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}*/
		
		//Di chuyển file
		/*File f4 = new File("C:\\Users\\Admin\\Desktop\\mp\\mp(2)\\3.txt");
		try 
		{
			Files.move(f3.toPath(), f4.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) 
		{
			// TODO: handle exception
		}*/
		//Coppy File
		File f5 = new File("C:\\Users\\Admin\\Desktop\\mp");
		File f6 = new File("C:\\Users\\Admin\\Desktop\\mp_copy");
		try {
			Files.copy(f5.toPath(),f6.toPath(),StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			// TODO: handle exception
		}//Cách này chỉ có thể coppy phần vỏ
		
		//Coppy tất cả ruột
		File f7 = new File("C:\\Users\\Admin\\Desktop\\mp\\mp(2)");
		File f8 = new File("C:\\Users\\Admin\\Desktop\\mp\\mp(2)_coppy");
		vdfile.copyTatCa(f7,f8);
		System.out.println(f0.getAbsoluteFile());
	}
}
