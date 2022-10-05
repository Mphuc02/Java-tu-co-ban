package t97_Hien_thi_cua_so_thong_bao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ThucDonControler implements ActionListener
{
	private ThucDonView view;
	
	public ThucDonControler(ThucDonView view) 
	{
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String button = e.getActionCommand();
		if(button.equals("Thanh toán"))
		{
			String thongBao = (String) JOptionPane.showInputDialog(view,"Có cái đầu buồi","Thông báo", JOptionPane.PLAIN_MESSAGE);
			int thongBao2 = JOptionPane.showConfirmDialog(view, "Có chấp nhận không ?");
		}
	}

}
