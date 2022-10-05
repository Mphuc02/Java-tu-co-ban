package t76_Nen_va_Giai_nen_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Nen_nhieu_file {
	public static void Nen_Nhieu_file() throws IOException
	{
		List<String> srcFile = Arrays.asList("D:\\Learning\\jav\\123\\src\\t76_Nen_va_Giai_nen_File\\test1.txt", "D:\\Learning\\jav\\123\\src\\t76_Nen_va_Giai_nen_File\\test2.txt");
		FileOutputStream fos = new FileOutputStream("D:\\Learning\\jav\\123\\src\\t76_Nen_va_Giai_nen_File\\multiCompressed.zip");
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		for(String s : srcFile)
		{
			File fileToZip = new File(s);
			FileInputStream fis = new FileInputStream(fileToZip);
			ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
			zipOut.putNextEntry(zipEntry);
			
			byte bytes[] = new byte[1024];
			int length;
			while( (length = fis.read(bytes)) >= 0)
			{
				zipOut.write(bytes, 0 , length);
			}
			fis.close();
		}
		zipOut.close();
		fos.close();
	}
}
