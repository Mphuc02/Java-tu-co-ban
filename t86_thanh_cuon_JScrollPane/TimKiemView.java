package t86_thanh_cuon_JScrollPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import test.actionListener;

public class TimKiemView extends JFrame
{
	private JTextArea jta_nhapVanBan = new JTextArea();
	
	private JTextField jtf_tuKhoa;
	
	private JLabel jlb_ketQua;
	
	public TimKiemView() 
	{
		
		this.init();
	}
	
	private void init()
	{
		this.setTitle("Tim kiem");
		this.setSize(500,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane jsp = new JScrollPane(jta_nhapVanBan);
		JLabel jlb = new JLabel("Phuc");
		
		this.setLayout(new BorderLayout());
		this.add(jsp,BorderLayout.CENTER);
		this.add(jlb,BorderLayout.NORTH);
		this.setVisible(true);
	}
}