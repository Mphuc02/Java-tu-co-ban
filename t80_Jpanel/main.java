package t80_Jpanel;

import javax.swing.UIManager;

public class main 
{
	public static void main(String[] args) 
	{
		try 
		{
			//Thay đổi giao diện hệ diều hành theo giao diện của người dùng
			//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			//Góc nhìn của GTK
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKlookAndFeel");
			
			//Góc nhìn của motif
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			
			new calculator();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
