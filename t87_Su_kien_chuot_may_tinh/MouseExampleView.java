package t87_Su_kien_chuot_may_tinh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseExampleView extends JFrame
{
	private MouseExampleModel model;
	
	private JLabel jlb_position;
	private JLabel jlb_x;
	private JLabel jlb_y;
	private JLabel jlb_count;
	private JLabel jlb_count_value;
	private JLabel jlb_check;
	private JLabel jlb_check_in_value;
	private JLabel jlb_empty_1;
	private JLabel jlb_empty_2;
	
	public MouseExampleView()
	{
		this.model = new MouseExampleModel();
		this.init();
	}
	
	private void init()
	{
		this.setTitle("Mouse Events");
		this.setSize(400,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MouseExampleListener mouse = new MouseExampleListener(this);
		JPanel jpn_mouse = new JPanel();
		jpn_mouse.setBackground(Color.lightGray);
		jpn_mouse.addMouseListener(mouse); // Lắng nghe ấn chuột
		jpn_mouse.addMouseMotionListener(mouse); // Lắng nghe chuột di chuyển
		
		JPanel jpn_infor = new JPanel();
		jpn_infor.setLayout(new GridLayout(3,3));
 		
		jlb_position = new JLabel("Position:");
		jlb_x = new JLabel("x = ");
		jlb_y = new JLabel("y = ");
		jlb_count = new JLabel("Number of clicks: ");
		jlb_count_value = new JLabel();
		jlb_check = new JLabel("Mouse is in component"); 
		jlb_check_in_value = new JLabel();
		jlb_empty_1 = new JLabel();
		jlb_empty_2 = new JLabel();
		
		jpn_infor.add(jlb_position);
		jpn_infor.add(jlb_x);
		jpn_infor.add(jlb_y);
		jpn_infor.add(jlb_count);
		jpn_infor.add(jlb_count_value);
		jpn_infor.add(jlb_empty_1);
		jpn_infor.add(jlb_check);
		jpn_infor.add(jlb_check_in_value);
		jpn_infor.add(jlb_empty_2);
		
		this.setLayout(new BorderLayout());
		this.add(jpn_mouse,BorderLayout.CENTER);
		this.add(jpn_infor,BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public void click()
	{
		this.model.addClick();
		this.jlb_count_value.setText(this.model.getCount() + "");
	}
	
	public void enter()
	{
		this.model.enter();
		this.jlb_check_in_value.setText(this.model.getCheckIn());
	}
	
	public void exit()
	{
		this.model.exit();
		this.jlb_check_in_value.setText(this.model.getCheckIn());
	}
	
	public void upDate(int x, int y)
	{
		this.model.setX(x);
		this.model.setY(y);
		this.jlb_x.setText(this.model.getX() + "");
		this.jlb_y.setText(this.model.getY() + "");
	}
}
