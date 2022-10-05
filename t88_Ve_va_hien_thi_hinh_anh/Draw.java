package t88_Ve_va_hien_thi_hinh_anh;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Draw extends JFrame
{
	public Draw()
	{
		this.setTitle("Image");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		View jpn_Draw = new View();
		
		this.setLayout(new BorderLayout());
		this.add(jpn_Draw, BorderLayout.CENTER);
		this.setVisible(true);
	}
}
