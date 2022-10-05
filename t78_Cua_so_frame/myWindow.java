package t78_Cua_so_frame;

import javax.swing.JFrame;

public class myWindow extends JFrame
{
	public myWindow()
	{
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	public void Show()
	{
		this.setVisible(true);
	}
	
	public void Show(String title)
	{
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public void Show(String title, int width,int height)
	{
		this.setTitle(title);
		this.setSize(width, height);
		this.setVisible(true);
	}
}
