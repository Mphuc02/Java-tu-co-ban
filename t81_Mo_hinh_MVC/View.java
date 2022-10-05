package t81_Mo_hinh_MVC;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame
{
	private counterModel ct;
	private JButton jbtn_up,
					jbtn_down,
					jbtn_reset;
	private JLabel jlb_value;
	
	public View() 
	{
		ct = new counterModel();
		init();
		this.setVisible(true);
	}
	
	public void init()
	{
		this.setTitle("Counter");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener ac = new Listener(this);//Tạo ra sự kiện để lắng nghe người dùng chọn nút bấm
		
		jbtn_up = new JButton("UP");
		jbtn_up.addActionListener(ac);
		
		jbtn_down = new JButton("DOWN");
		jbtn_down.addActionListener(ac);
		
		jbtn_reset = new JButton("RESET");
		jbtn_reset.addActionListener(ac);
		jlb_value = new JLabel(this.ct.getValue() + "" , JLabel.CENTER);
		
		JPanel jpl = new JPanel();
		jpl.setLayout(new BorderLayout());
		jpl.add(jbtn_up,BorderLayout.WEST);
		jpl.add(jlb_value,BorderLayout.CENTER);
		jpl.add(jbtn_down,BorderLayout.EAST);
		jpl.add(jbtn_reset,BorderLayout.SOUTH);
		
		this.setLayout(new BorderLayout());
		this.add(jpl,BorderLayout.CENTER);
	}
	
	public void v_INC()
	{
		this.ct.INC();
		this.jlb_value.setText(this.ct.getValue() + "");
	}
	
	public void v_DESC()
	{
		this.ct.DESC();
		this.jlb_value.setText(this.ct.getValue() + "");
	}
	
	public void v_Reset()
	{
		this.ct.Reset();
		this.jlb_value.setText(this.ct.getValue() + "");
	}
}
