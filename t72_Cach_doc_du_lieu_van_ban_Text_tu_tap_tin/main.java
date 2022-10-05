package t72_Cach_doc_du_lieu_van_ban_Text_tu_tap_tin;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.Identity;
import java.util.List;

public class main {
	public static void main(String[] args) 
	{
		//Cách 1
		File f = new File("C:\\Users\\Admin\\Desktop\\mp\\mp(2)\\3.txt");
		try 
		{
			BufferedReader br = Files.newBufferedReader(f.toPath(),StandardCharsets.UTF_8);
			String line = null;
			while(true)
			{
				line = br.readLine();
				if(line == null)
				{
					break;
				}
				else 
				{
					System.out.println(line);
				}
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//Cách 2:
		File f2 = new File("C:\\Users\\Admin\\Desktop\\mp\\mp(2)\\3.txt");
		try 
		{
			List<String>allText = Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
			for(String s : allText)
				System.out.println(s);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
