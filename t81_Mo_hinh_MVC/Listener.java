package t81_Mo_hinh_MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener
{
	private View v;
	
	public Listener(View V)
	{
		v = V;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("Ban da nhan nut " + e.getActionCommand());
		
		//Lấy tên của nút
		String string = e.getActionCommand();
		
		if(string == "UP")
		{
			this.v.v_INC();
		}
		else if(string == "DOWN") 
		{
			this.v.v_DESC();
		}
		else if(string == "RESET")
		{
			this.v.v_Reset();
		}
	}
	
}
