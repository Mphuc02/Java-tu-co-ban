package t93_Them_tich_chon_vao_menu;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class MenuBarView extends JFrame
{
	private JLabel jlb = new JLabel();

	public JPopupMenu jpmn;
	
	private JMenuBar jmn_menu;
	
	private JToolBar jtb;

	private MenuController controller;

	private MenuListener listener;
	
	public MenuBarView()
	{
		//Tạo controller
		controller = new MenuController(this);
		
		listener = new MenuListener(this);
		
		this.init();
	}
	
	private void init()
	{
		this.setTitle("Menu");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		thanhMenu();
		menuPopUp();
		
		this.addMouseListener(listener);	
		this.setLayout(new BorderLayout());
		this.add(jlb, BorderLayout.CENTER);
		this.setVisible(true);
		
		thanhCongCu();// Phải chuyển xuống dưới để add jtb vào không bị lỗi
	}

	private void thanhCongCu()
	{
		//Tạo thanh côn cụ
		jtb = new JToolBar();
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
		
		this.add(jtb,BorderLayout.NORTH);
		this.jtb.setVisible(false);
	}
	
	private void menuPopUp()
	{
		//Tạo popUpMenu
		jpmn = new JPopupMenu();
		JMenuItem jmni_type = new JMenuItem("Type");
		JMenuItem jmni_size = new JMenuItem("Size");
		JMenuItem jmni_coppy = new JMenuItem("Coppy");
		JMenuItem jmni_paste = new JMenuItem("Paste");
		jpmn.add(jmni_type);
		jpmn.add(jmni_size);
		jpmn.add(jmni_coppy);
		jpmn.add(jmni_paste);
		this.add(jpmn);
	}
	
	public void thanhMenu()
	{
		jmn_menu = new JMenuBar();
		
		JMenu jmn_fileItem = new JMenu("File");
		JMenuItem jmni_open = new JMenuItem("Open File");
		JMenuItem jmni_new = new JMenuItem("New File");
		JMenuItem jmni_exit = new JMenuItem("Exit");
		jmn_fileItem.add(jmni_new);
		jmn_fileItem.add(jmni_open);
		jmn_fileItem.add(jmni_exit);
		jmn_menu.add(jmn_fileItem);
		
		JMenu jmn_source = new JMenu("Source");
		JMenu jmn_generate = new JMenu("Generate");
		JMenuItem jmni_constructor = new JMenuItem("Constructor");
		JMenuItem jmni_getterSetter = new JMenuItem("Getter & Setter");;
		jmn_generate.add(jmni_constructor);
		jmn_generate.add(jmni_getterSetter);
		jmn_source.add(jmn_generate);
		jmn_menu.add(jmn_source);
		
		//Menu view
		JMenu jmn_view = new JMenu("View");
		JCheckBoxMenuItem jcbmi_toolbar = new JCheckBoxMenuItem("Tool Bar");
		jcbmi_toolbar.addActionListener(controller);
		jmn_view.add(jcbmi_toolbar);
		jmn_menu.add(jmn_view);
		
		this.setJMenuBar(jmn_menu);
	}

	public void setTextJlabel(String string) 
	{
		jlb.setText(string);
	}
	
	public void enableToolbar()
	{
		this.jtb.setVisible(true);
	}
	
	public void disableToolbar()
	{
		this.jtb.setVisible(false);
	}
}
