package t87_Su_kien_chuot_may_tinh;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseExampleListener implements MouseListener, MouseMotionListener
{
	private MouseExampleView view;
	
	public MouseExampleListener(MouseExampleView view)
	{
		this.view = view;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		this.view.click();
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		this.view.enter();
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		this.view.exit();
	}

	@Override
	public void mouseDragged(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) 
	{
		int x = e.getX(),
			y = e.getY();
		this.view.upDate(x,y);
	}

}
