package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionListener implements ActionListener
{
	private calculator c;
	public actionListener(calculator C)
	{
		c = C;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String s = e.getActionCommand();
		if(s.compareTo("0") >= 0 && s.compareTo("9") <= 0)
		{
			c.Hien_thi_So(s);
		}
    	else if( s.compareTo("x") == 0 || s.compareTo("+") == 0 || s.compareTo("-") == 0 || s.compareTo("/") == 0 || s.compareTo("=") == 0)
		{
    		c.thuc_hien(s);
		}
	}

}
