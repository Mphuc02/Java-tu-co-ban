package t76_Nen_va_Giai_nen_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Nen_1_file {
	public static void main(String[] args) throws IOException 
	{
		//Nén 1 file
//		String sourceFile = "D:\\Learning\\jav\\123\\src\\t76_Nen_va_Giai_nen_File\\test1.txt";
//		FileOutputStream fos = new FileOutputStream("D:\\Learning\\jav\\123\\src\\t76_Nen_va_Giai_nen_File\\compressed.zip");
//		ZipOutputStream zipOut = new ZipOutputStream(fos);
//		
//		File fileToZip = new File(sourceFile);
//		FileInputStream fis = new FileInputStream(fileToZip);
//		
//		ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
//		zipOut.putNextEntry(zipEntry);
//		byte bytes[] = new byte[1024];
//		int length;
//		while( (length = fis.read(bytes)) >= 0)
//		{
//			zipOut.write(bytes, 0 , length);
//		}
//		zipOut.close();
//		fis.close();
//		fos.close();
//		
//		Nen_nhieu_file.Nen_Nhieu_file();
		
		Giai_Nen_file.giai_nen_file();
	}
}
