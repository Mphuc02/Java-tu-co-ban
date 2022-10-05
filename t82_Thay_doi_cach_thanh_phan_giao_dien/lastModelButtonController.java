package t82_Thay_doi_cach_thanh_phan_giao_dien;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;

public class lastModelButtonController implements ActionListener
{
	lastButtonView lsbv;
	
	public lastModelButtonController(lastButtonView lsbv) 
	{
		this.lsbv = lsbv;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String s = e.getActionCommand();
		if(s.equals("1"))
		{
			lsbv.changTo1();
		}
		else if(s.equals("2"))
		{
			lsbv.changTo2();
		}
		else if(s.equals("3"))
		{
			lsbv.changTo3();
		}
		else if(s.equals("4"))
		{
			lsbv.changTo4();
		}
	}
}
