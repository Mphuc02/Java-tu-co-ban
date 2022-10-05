package t89_Thanh_menu;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarView extends JFrame
{
	private JLabel jlb;

	public MenuBarView()
	{
		
		this.init();
	}
	
	private void init()
	{
		this.setTitle("Menu");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar jmb = new JMenuBar();
		
		//Tạo controller
		MenuController controller = new MenuController(this);
		
		JMenu jmn_1 = new JMenu("File");
		JMenuItem jmni_newFile = new JMenuItem("New File");
		jmni_newFile.addActionListener(controller);
		
		JMenuItem jmni_openFile = new JMenuItem("Open File");
		jmni_openFile.addActionListener(controller);
		
		JMenuItem jmni_exit = new JMenuItem("Exit");
		jmni_exit.addActionListener(controller);
		
		jmn_1.add(jmni_newFile);
		jmn_1.addSeparator();// Thêm dấu gạch ngang vào dưới dùng để phân chia các nút bấm
		jmn_1.add(jmni_openFile);
		jmn_1.addSeparator();
		jmn_1.add(jmni_exit);
		
		JMenu jmn_2 = new JMenu("Source");
		JMenuItem jmni_rename = new JMenuItem("Rename");
		jmni_rename.addActionListener(controller);
		jmn_2.add(jmni_rename);
		
		JMenu jmn_3 = new JMenu("Option");
		
		jmb.add(jmn_1);
		jmb.add(jmn_2);
		jmb.add(jmn_3);
		
		//Thêm menu vào chương trình
		this.setJMenuBar(jmb);
		
		//Tạo label hiển thị
		Font font = new Font("Arial", Font.BOLD, 50);
		jlb = new JLabel();
		
		this.setLayout(new BorderLayout());
		this.add(jlb, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public void setTextJlabel(String s)
	{
		this.jlb.setText(s);
	}
}
