package t83_Thay_doi_mau_background;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myColorListener implements ActionListener
{
	private myColorView view;
	
	public myColorListener(myColorView view)
	{
		this.view = view;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String src = e.getActionCommand();
		if(src.equals("Red Text"))
		{
			view.changeTextColor(Color.RED);
		}
		else if(src.equals("Yellow Text"))
		{
			view.changeTextColor(Color.YELLOW);
		}
		else if(src.equals("Blue Text"))
		{
			view.changeTextColor(Color.BLUE);
		}
		else if(src.equals("Red background"))
		{
			view.changeBackgroundColor(Color.RED);
		}
		else if(src.equals("Blue background"))
		{
			view.changeBackgroundColor(Color.BLUE);
		}
		else if(src.equals("Yellow background"))
		{
			view.changeBackgroundColor(Color.YELLOW);
		}
 	}

}
