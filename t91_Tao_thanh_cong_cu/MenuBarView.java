package t91_Tao_thanh_cong_cu;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

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

		//Tạo controller
		MenuController controller = new MenuController(this);

		//Tạo thanh côn cụ
		JToolBar jtb = new JToolBar();
		JButton jbtn_undo = new JButton("Undo");
		jbtn_undo.addActionListener(controller);
		jbtn_undo.setToolTipText("Khôi phục bước trước");//Di chuột vào sẽ thấy
		
		JButton jbtn_redo = new JButton("Redo");
		jbtn_redo.addActionListener(controller);
		
		JButton jbtn_coppy = new JButton("Coppy");
		jbtn_coppy.addActionListener(controller);
		
		JButton jbtn_paste = new JButton("Paste");
		jbtn_paste.addActionListener(controller);
		jtb.add(jbtn_undo);
		jtb.add(jbtn_redo);
		jtb.add(jbtn_coppy);
		jtb.add(jbtn_paste);
		
		//Tạo label hiển thị
		Font font = new Font("Arial", Font.BOLD, 50);
		jlb = new JLabel();
		
		this.setLayout(new BorderLayout());
		this.add(jlb, BorderLayout.CENTER);
		this.add(jtb,BorderLayout.NORTH);
		this.setVisible(true);
	}
	
	public void setTextJlabel(String s)
	{
		this.jlb.setText(s);
	}
}
