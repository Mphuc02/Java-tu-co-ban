package t82_Thay_doi_cach_thanh_phan_giao_dien;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class lastButtonView extends JFrame
{
	private lastModelButtonModel lbtn;
	private JLabel jlb = new JLabel("----");

	public lastButtonView() throws HeadlessException 
	{
		lbtn = new lastModelButtonModel(0);
		init();
		this.setVisible(true);
	}

	private void init() 
	{
		this.setTitle("Last button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		
		JPanel jpl_center = new JPanel();
		jpl_center.setLayout(new GridLayout(2,2,10,10));
		
		Font fnt = new Font("Arial",Font.BOLD,30);//Tạo font chữ
		
		ActionListener ac = new lastModelButtonController(this);
		
		JButton jbtn[] = new JButton[4];
		for(int i = 0;i<4;i++)
		{
			jbtn[i] = new JButton( (i+1) + "" );
			jbtn[i].setFont(fnt);//gán font chữ
			jpl_center.add(jbtn[i]);
			jbtn[i].addActionListener(ac);
		}
		
		JPanel jpl_footer = new JPanel();
		jpl_footer.add(jlb);
		
		this.setLayout(new BorderLayout());
		this.add(jpl_center,BorderLayout.CENTER);
		this.add(jpl_footer,BorderLayout.SOUTH);
	}
	
	public void changTo1()
	{
		lbtn.setValue1();
		jlb.setText("Last button " + this.lbtn.getValue());
	}
	
	public void changTo2()
	{
		lbtn.setValue2();
		jlb.setText("Last button " + this.lbtn.getValue());
	}
	
	public void changTo3()
	{
		lbtn.setValue3();
		jlb.setText("Last button " + this.lbtn.getValue());
	}
	
	public void changTo4()
	{
		lbtn.setValue4();
		jlb.setText("Last button " + this.lbtn.getValue());
	}
}
