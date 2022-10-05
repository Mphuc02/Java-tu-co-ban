package t85_Su_dung_JTextArea;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import test.actionListener;

public class TimKiemView extends JFrame
{
	private TimKiemModel timkeKiemModel;

	private JTextArea jta_nhapVanBan;
	
	private JTextField jtf_tuKhoa;
	
	private JLabel jlb_ketQua;
	
	public TimKiemView() throws HeadlessException 
	{
		this.timkeKiemModel = new TimKiemModel();
		this.init();
	}
	
	private void init()
	{
		this.setTitle("Tiem kiem");
		this.setSize(500,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Center
		Font font = new Font("Arial", Font.BOLD, 40);
		JLabel jlb_vanBan = new JLabel("Van ban");
		
		jta_nhapVanBan = new JTextArea(100,100);
		jta_nhapVanBan.setFont(font);
		
		JLabel jlb_tuKhoa = new JLabel("Tu khoa");
		
		jtf_tuKhoa = new JTextField();
 		
		JPanel jpl_center = new JPanel();
		jpl_center.setLayout(new GridLayout(4,1,10,10));
		jpl_center.add(jlb_vanBan);
		jpl_center.add(jta_nhapVanBan);
		
		
		//Footer
		TimKiemListener timKiemListener = new TimKiemListener(this);
		JPanel jpl_footer = new JPanel();
		jpl_footer.setLayout(new GridLayout(2,2,10,0));

		JButton jbtn_thongKe = new JButton("Thong ke");
		jbtn_thongKe.setFont(font);
		jbtn_thongKe.addActionListener(timKiemListener);
		
		jlb_ketQua = new JLabel();
		
		jpl_footer.add(jlb_tuKhoa);
		jpl_footer.add(jtf_tuKhoa);
		jpl_footer.add(jbtn_thongKe);
		jpl_footer.add(jlb_ketQua);
		
		
		this.setLayout(new BorderLayout());
		this.add(jpl_center,BorderLayout.CENTER);
		this.add(jpl_footer, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public void timKiem()
	{
		this.timkeKiemModel.setVanBan(jta_nhapVanBan.getText());
		this.timkeKiemModel.setTuKhoa(jtf_tuKhoa.getText());
		this.timkeKiemModel.timKiem();
		this.jlb_ketQua.setText(this.timkeKiemModel.getKetQua());
	}
}