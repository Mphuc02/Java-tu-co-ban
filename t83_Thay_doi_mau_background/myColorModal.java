package t83_Thay_doi_mau_background;

import java.awt.Color;

public class myColorModal 
{
	private Color foreGround,
				   backGround;
	private boolean opaQue;
	public myColorModal() 
	{
		this.foreGround = Color.BLACK;
		this.backGround = Color.WHITE;
		this.opaQue = true;
		
	}
	public Color getForeGround() 
	{
		return foreGround;
	}
	public void setForeGround(Color foreGround) 
	{
		this.foreGround = foreGround;
	}
	public Color getBackGround() 
	{
		return backGround;
	}
	public void setBackGround(Color backGround) 
	{
		this.backGround = backGround;
	}
	public boolean isOpaQue() 
	{
		return opaQue;
	}
	public void setOpaQue(boolean opaQue) 
	{
		this.opaQue = opaQue;
	}
	
	
}
