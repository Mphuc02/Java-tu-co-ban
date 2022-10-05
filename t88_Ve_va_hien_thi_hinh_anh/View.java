package t88_Ve_va_hien_thi_hinh_anh;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class View extends JPanel
{
	public View()
	{
		this.setBackground(Color.white);
	}

	@Override
	protected void paintComponent(Graphics g) 
	{
		g.setColor(Color.red);
		g.drawLine(15, 15, 50, 150);
		
		g.setColor(Color.green);
		g.drawRect(5, 5, 30, 40);
		
		g.setColor(Color.pink);
		g.fillOval(100, 100, 40, 40);
	}
}