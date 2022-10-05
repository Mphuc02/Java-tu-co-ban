package t84_Su_dung_JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculatorListener implements ActionListener
{
	private MiniCalculatorView miniCalculatorView;
	
	public MiniCalculatorListener(MiniCalculatorView miniCalculatorView) 
	{
		this.miniCalculatorView = miniCalculatorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String button = e.getActionCommand();
		if(button.equals("+"))
			this.miniCalculatorView.plus();
		else if(button.equals("-"))
			this.miniCalculatorView.minus();
		else if(button.equals("*"))
			this.miniCalculatorView.mul();
		else if(button.equals("/"))
			this.miniCalculatorView.div();
		else if(button.equals("%"))
			this.miniCalculatorView.mod();
		else if(button.equals("^"))
			this.miniCalculatorView.pow();
	}

}
