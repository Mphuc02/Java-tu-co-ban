package t89_Thanh_menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener
{
	private MenuBarView view;
	
	public MenuController(MenuBarView view) 
	{
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String button = e.getActionCommand();
		if(button.equals("New File"))
			this.view.setTextJlabel("New File");
		else if(button.equals("Open File"))
			this.view.setTextJlabel("Open File");
		else if(button.equals("Rename"))
			this.view.setTextJlabel("Rename");
		else if(button.equals("Exit"))
			System.exit(0);
	}	
}
