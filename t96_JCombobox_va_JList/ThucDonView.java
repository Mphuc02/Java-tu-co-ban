package t96_JCombobox_va_JList;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class ThucDonView extends JFrame
{
	private ThucDonModel model;
	private JComboBox jcb_monChinh;
	private JList jl_monPhu;
	
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
		jpl_monChinh.setLayout(new FlowLayout());
		String monChinhList[] = new String[] {"Cơm", "Phở", "Bún"};
		jcb_monChinh = new JComboBox<>(monChinhList);
		jpl_monChinh.add(jcb_monChinh);
		
		JPanel jpl_monPhu = new JPanel();
		jpl_monPhu.setLayout(new FlowLayout());
		String monPhuList[] = new String[] {"Trà sữa", "CoCa", "Trà đá","Kem"};
		jl_monPhu = new JList<>(monPhuList);
		jpl_monPhu.add(jl_monPhu);
		
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
