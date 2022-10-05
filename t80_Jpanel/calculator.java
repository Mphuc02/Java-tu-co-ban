package t80_Jpanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator extends JFrame
{
	public calculator() 
	{
		this.setTitle("Calculator");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jtfield = new JTextField(50);//Trường văn bản
		
		JPanel jPanel_head = new JPanel();//Vật chứa để đựng những thành phần khác
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jtfield,BorderLayout.CENTER);
		
		JButton btn0 = new JButton("0");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btn_cong = new JButton("+");
		JButton btn_tru = new JButton("-");
		JButton btn_nhan = new JButton("x");
		JButton btn_chia = new JButton("/");
		JButton btn_bang = new JButton("=");
		
		this.setLayout(new BorderLayout());
		
		JPanel jPanel_btn = new JPanel();
		jPanel_btn.setLayout(new GridLayout(5,3));

		jPanel_btn.add(btn0);	
		jPanel_btn.add(btn1);	
		jPanel_btn.add(btn2);	
		jPanel_btn.add(btn3);	
		jPanel_btn.add(btn4);	
		jPanel_btn.add(btn5);	
		jPanel_btn.add(btn6);	
		jPanel_btn.add(btn7);	
		jPanel_btn.add(btn8);	
		jPanel_btn.add(btn9);	
		jPanel_btn.add(btn_cong);
		jPanel_btn.add(btn_tru);
		jPanel_btn.add(btn_nhan);
		jPanel_btn.add(btn_chia);
		jPanel_btn.add(btn_bang);
		
		this.add(jPanel_head,BorderLayout.NORTH);
		this.add(jPanel_btn,BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
