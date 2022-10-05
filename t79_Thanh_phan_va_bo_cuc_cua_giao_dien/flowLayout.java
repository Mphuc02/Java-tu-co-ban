package t79_Thanh_phan_va_bo_cuc_cua_giao_dien;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class flowLayout extends JFrame
{
	public flowLayout()
	{
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setTitle("Vi du flow layout");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);//căn giữa cửa sổ chương trình
		
		//set layout
		FlowLayout flowLayout = new FlowLayout();
		FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.TRAILING);
		FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER,50,50);
		this.setLayout(flowLayout_2);
		
		JButton jbt1 = new JButton("1");
		JButton jbt2 = new JButton("2");
		JButton jbt3 = new JButton("3");
		
		//add thành phần
		this.add(jbt1);
		this.add(jbt2);
		this.add(jbt3);
		
		this.setVisible(true);
	}
	
}
