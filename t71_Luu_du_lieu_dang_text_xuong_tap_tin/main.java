package t71_Luu_du_lieu_dang_text_xuong_tap_tin;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class main {
	public static void main(String[] args) 
	{
		PrintWriter pw;
		try {
			pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\mp\\mp(2)\\3.txt","UTF-8");
		pw.println("đINH MINH phúc");
		pw.print(1234);
		pw.flush();//Phải có dòng này thì mới in ra
		pw.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
