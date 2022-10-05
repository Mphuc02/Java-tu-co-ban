package test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class calculator extends JFrame
{
	private int temp = 0,
				f_t = 1, 
				phep_tinh = 0;
	private JButton jbtn_number[] = new JButton[10],
					jbtn_nhan,
					jbtn_cong,
					jbtn_tru,
					jbtn_chia,
					jbtn_bang;
	private JLabel jlb,
				   jlb2;
	
	public calculator() 
	{
		this.setTitle("Calculator");
		this.init();
		this.setVisible(true);
	}
	
	public void init()
	{
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		actionListener ac = new actionListener(this);
		
		
		JPanel jpl_top = new JPanel();
		jpl_top.setLayout(new GridLayout(2,2,10,10));
		jlb = new JLabel("0");
		jlb2 = new JLabel("0"); 
		jpl_top.add(jlb);
		jpl_top.add(jlb2);
		
		JPanel jpl1 = new JPanel();
		jpl1.setLayout(new GridLayout(4,3,10,10));
		for(int i = 0;i<10;i++)
		{
			jbtn_number[i] = new JButton(i + "");
			jbtn_number[i].addActionListener(ac);
			jpl1.add(jbtn_number[i]);
		}
		
		JPanel jpl2 = new JPanel();
		jpl2.setLayout(new FlowLayout());
		jbtn_cong = new JButton("+");
		jbtn_cong.addActionListener(ac);
		
		jbtn_nhan = new JButton("x");
		jbtn_nhan.addActionListener(ac);
		
		jbtn_tru = new JButton("-");
		jbtn_tru.addActionListener(ac);
		
		jbtn_chia = new JButton("/");
		jbtn_chia.addActionListener(ac);
		
		jbtn_bang = new JButton("=");
		jbtn_bang.addActionListener(ac);
		jpl2.add(jbtn_cong);
		jpl2.add(jbtn_tru);
		jpl2.add(jbtn_nhan);
		jpl2.add(jbtn_chia);
		jpl2.add(jbtn_bang);
		
		this.setLayout( new BorderLayout());
		this.add(jpl_top,BorderLayout.NORTH);
		this.add(jpl1, BorderLayout.CENTER);
		this.add(jpl2,BorderLayout.SOUTH);
	}
	
	private void tinh()
	{
		int a = Integer.parseInt(jlb.getText()) ;
		if(phep_tinh == 0)
		{
			temp = a;
		}
		else if(phep_tinh == 1)
		{
			temp += a;
		}
		else if(phep_tinh == 2)
		{
			temp -= a;
		}
		else if(phep_tinh == 3)
		{
			temp *= a;
		}
		else if(phep_tinh == 4)
		{
			temp /= a;
		}
		jlb.setText("0");
		jlb2.setText(temp + "");
		phep_tinh = 0;
	}
	
	public void thuc_hien(String s)
	{
		tinh();
		if(s.compareTo("+") == 0)
		{
			phep_tinh = 1;
		}
		else if(s.compareTo("-") == 0)
		{
			phep_tinh = 2;
		}
		else if(s.compareTo("x") == 0)
		{
			phep_tinh = 3;
		}
		else if(s.compareTo("/") == 0)
		{
			phep_tinh = 4;
		}
		else if(s.compareTo("=") == 0)
		{
			phep_tinh = 5;
		}
	}
	
	public void Hien_thi_So(String s)
	{
		String pre_String = (jlb.getText().compareTo("0") != 0 ) ? jlb.getText() : "";
		jlb.setText(pre_String + s);
	}
}
