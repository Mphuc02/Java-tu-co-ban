package t93_Them_tich_chon_vao_menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

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
		else if(button.equals("Tool Bar"))
		{
			AbstractButton check = (AbstractButton) e.getSource();
			if(check.getModel().isSelected()) //Kiểm tra xem có được tick hay không ?
				this.view.enableToolbar();
			else
				this.view.disableToolbar();
		}
	}	
}
