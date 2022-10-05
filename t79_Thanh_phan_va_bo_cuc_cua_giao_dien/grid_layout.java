package t79_Thanh_phan_va_bo_cuc_cua_giao_dien;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class grid_layout extends JFrame
{
	public grid_layout()
	{
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setTitle("Vi du grid layout");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);//căn giữa cửa sổ chương trình
		
		//set layout
		GridLayout gl1 = new GridLayout();
		GridLayout gl2 = new GridLayout(4, 3);
		GridLayout gl3 = new GridLayout(4, 3, 40, 30);
		this.setLayout(gl3);
		
		//add thành phần
		for(int i = 1;i<=12;i++)
		{
			JButton jbtn = new JButton(i + "");
			this.add(jbtn);
		}
		
		this.setVisible(true);
	}
}
