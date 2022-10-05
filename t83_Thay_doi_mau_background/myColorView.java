package t83_Thay_doi_mau_background;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class myColorView extends JFrame
{
	private myColorModal colorModal;
	private JLabel jlb;
	
	public myColorView()
	{
		this.colorModal = new myColorModal();
		this.init();
	}
	
	private void init()
	{
		this.setTitle("My color");
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.jlb = new JLabel("Text");
		
		myColorListener myColorListener = new myColorListener(this);
		
		JPanel jpn = new JPanel();
		jpn.setLayout(new GridLayout(2,3));
		
		JButton jbtn_text_red = new JButton("Red Text");
		jbtn_text_red.setForeground(Color.red);
		jpn.add(jbtn_text_red);
		jbtn_text_red.addActionListener(myColorListener);
		
		JButton jbtn_text_yellow = new JButton("Yellow Text");
		jbtn_text_yellow.setForeground(Color.yellow);
		jpn.add(jbtn_text_yellow);
		jbtn_text_yellow.addActionListener(myColorListener);
		
		JButton jbtn_text_blue = new JButton("Blue Text");
		jbtn_text_blue.setForeground(Color.blue);
		jpn.add(jbtn_text_blue);
		jbtn_text_blue.addActionListener(myColorListener);
		
		JButton jbtn_background_red = new JButton("Red background");
		jbtn_background_red.setBackground(Color.red);
		jbtn_background_red.setOpaque(true);
		jpn.add(jbtn_background_red);
		jbtn_background_red.addActionListener(myColorListener);
		
		JButton jbtn_background_yellow = new JButton("Yellow background");
		jbtn_background_yellow.setBackground(Color.yellow);
		jbtn_background_yellow.setOpaque(true);
		jpn.add(jbtn_background_yellow);
		jbtn_background_yellow.addActionListener(myColorListener);
		
		JButton jbtn_background_blue = new JButton("Blue background");
		jbtn_background_blue.setBackground(Color.blue);
		jbtn_background_blue.setOpaque(true);
		jpn.add(jbtn_background_blue);
		jbtn_background_blue.addActionListener(myColorListener);
		
		this.add(jlb,BorderLayout.NORTH);
		this.add(jpn,BorderLayout.CENTER);
		this.setVisible(true);
	}

	public void changeTextColor(Color color) 
	{
		this.jlb.setForeground(color);
	}
	
	public void changeBackgroundColor(Color color)
	{
		this.jlb.setBackground(color);
		this.jlb.setOpaque(true);
	}
}
