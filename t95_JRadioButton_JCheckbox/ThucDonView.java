package t95_JRadioButton_JCheckbox;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ThucDonView extends JFrame
{
	private ThucDonModel model;
	
	public ThucDonView()
	{
		model = new ThucDonModel();
		init();
	}
	
	private void init()
	{
		this.setTitle("Thuc don");
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		JLabel jlb_header = new JLabel("Thuc don nha hang co cai dau b...");
		JPanel jpl_tieuDe = new JPanel();
		jpl_tieuDe.add(jlb_header);
		this.add(jpl_tieuDe, BorderLayout.NORTH);
		
		JPanel jpl_monChinh = new JPanel();
		JLabel jlb_monChinh = new JLabel("Món chính");
		jpl_monChinh.setLayout(new GridLayout(1,3));
		JRadioButton jrbtn_com = new JRadioButton("Cơm");//Chỉ được chọn 1
		JRadioButton jrbtn_pho = new JRadioButton("Phở");
		JRadioButton jrbtn_bun = new JRadioButton("Bún");
		ButtonGroup bg_monChinh = new ButtonGroup(); //Dùng để duyệt qua từng nút trong phần này
		bg_monChinh.add(jrbtn_com);
		bg_monChinh.add(jrbtn_bun);
		bg_monChinh.add(jrbtn_pho);
		jpl_monChinh.add(jrbtn_com);
		jpl_monChinh.add(jrbtn_bun);
		jpl_monChinh.add(jrbtn_pho);
		
		JPanel jpl_monPhu = new JPanel();
		jpl_monPhu.setLayout(new GridLayout(1,3));
		JCheckBox jcb_traSua = new JCheckBox("Trà sữa");//Chọn được nhiều
		JCheckBox jcb_traDa = new JCheckBox("Trà đá");
		JCheckBox jcb_coca = new JCheckBox("Coca");
		ButtonGroup bg_monPhu = new ButtonGroup();
		bg_monPhu.add(jcb_coca);
		bg_monPhu.add(jcb_traDa);
		bg_monPhu.add(jcb_traSua);
		jpl_monPhu.add(jcb_coca);
		jpl_monPhu.add(jcb_traDa);
		jpl_monPhu.add(jcb_traSua);
		
		JPanel jpl_luaChon = new JPanel();
		jpl_luaChon.setLayout(new GridLayout(2,1));
		jpl_luaChon.add(jpl_monChinh);
		jpl_luaChon.add(jpl_monPhu);
		this.add(jpl_luaChon, BorderLayout.CENTER);
		
		JPanel jpl_thanhToan = new JPanel();
		jpl_thanhToan.setLayout(new GridLayout(1,2));
		JLabel jlb_thongTin = new JLabel();
		JButton jbtn_thanhToan = new JButton("Thanh toán");
		jpl_thanhToan.add(jlb_thongTin);
		jpl_thanhToan.add(jbtn_thanhToan);
		this.add(jpl_thanhToan, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
}
