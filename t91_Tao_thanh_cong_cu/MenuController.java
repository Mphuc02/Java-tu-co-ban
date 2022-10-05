package t91_Tao_thanh_cong_cu;

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
		if(button.equals("Undo"))
			this.view.setTextJlabel("Undo");
		else if(button.equals("Redo"))
			this.view.setTextJlabel("Redo");
		else if(button.equals("Coppy"))
			this.view.setTextJlabel("Coppy");
		else if(button.equals("Paste"))
			this.view.setTextJlabel("Paste");
	}	
}
