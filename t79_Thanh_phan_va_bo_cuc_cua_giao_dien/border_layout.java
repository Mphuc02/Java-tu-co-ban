package t79_Thanh_phan_va_bo_cuc_cua_giao_dien;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class border_layout extends JFrame
{
	public border_layout()
	{
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setTitle("Vi du border layout");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);//căn giữa cửa sổ chương trình
		
		//set layout
		BorderLayout bl1 = new BorderLayout();
		BorderLayout bl2 = new BorderLayout(15,15);
		
		this.setLayout(bl2);
		
		//add thành phần
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		
		this.add(btn1,BorderLayout.NORTH);
		this.add(btn2,BorderLayout.WEST);
		this.add(btn3,BorderLayout.EAST);
		this.add(btn4,BorderLayout.SOUTH);
		this.add(btn5,BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
