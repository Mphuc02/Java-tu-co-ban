package t93_Them_tich_chon_vao_menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPopupMenu;

public class MenuListener implements MouseListener
{
	private MenuBarView view;
	
	public MenuListener(MenuBarView view) 
	{
		this.view = view;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		hienThi(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		hienThi(e);
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
	
	private void hienThi(MouseEvent e)
	{
		if(e.isPopupTrigger()) //Nếu chuột phải được ấn xuống
		{
			this.view.jpmn.show(e.getComponent(),e.getX(),e.getY());
		}
	}
}
