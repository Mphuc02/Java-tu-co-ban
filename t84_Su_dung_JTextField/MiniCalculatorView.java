package t84_Su_dung_JTextField;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiniCalculatorView extends JFrame
{
	private MiniCalculatorModel miniCalculatorModel;
	
	private JTextField jtf_firstValue;
	
	private JTextField jtf_secondValue;
	
	private JTextField jtf_answer;
	
	public MiniCalculatorView()
	{
		this.miniCalculatorModel = new MiniCalculatorModel();
		this.init();
	}
	
	private void init()
	{
		this.setTitle("MiniCalculator");
		this.setSize(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		Font font = new Font("Arial", Font.BOLD, 40);
		
		JLabel jlb_firstValue = new JLabel("1st Value");
		jlb_firstValue.setFont(font);
		
		JLabel jlb_secondValue = new JLabel("2nd Value");
		jlb_secondValue.setFont(font);
		
		JLabel jlb_answer = new JLabel("answer");
		jlb_answer.setFont(font);
		
		jtf_firstValue = new JTextField(50);
		jtf_firstValue.setFont(font);
		
		jtf_secondValue = new JTextField(50);
		jtf_secondValue.setFont(font);
		
		jtf_answer = new JTextField(50);
		jtf_answer.setFont(font);
		
		JPanel jpl_input_output = new JPanel();
		jpl_input_output.setLayout(new GridLayout(3,2,10,10));
		jpl_input_output.add(jlb_firstValue);
		jpl_input_output.add(jtf_firstValue);
		jpl_input_output.add(jlb_secondValue);
		jpl_input_output.add(jtf_secondValue);
		jpl_input_output.add(jlb_answer);
		jpl_input_output.add(jtf_answer);
		
		//Phần nút bấm tính toán
		MiniCalculatorListener miniCalculatorListener = new MiniCalculatorListener(this);
		JButton jbtn_plus = new JButton("+");
		jbtn_plus.setFont(font);
		jbtn_plus.addActionListener(miniCalculatorListener);
		
		JButton jbtn_minus = new JButton("-");
		jbtn_minus.setFont(font);
		jbtn_minus.addActionListener(miniCalculatorListener);
		
		JButton jbtn_mul = new JButton("*");
		jbtn_mul.setFont(font);
		jbtn_mul.addActionListener(miniCalculatorListener);
		
		JButton jbtn_div = new JButton("/");
		jbtn_div.setFont(font);
		jbtn_div.addActionListener(miniCalculatorListener);
		
		JButton jbtn_mod = new JButton("%");
		jbtn_mod.setFont(font);
		jbtn_mod.addActionListener(miniCalculatorListener);
		
		JButton jbtn_pow = new JButton("^");
		jbtn_pow.setFont(font);
		jbtn_pow.addActionListener(miniCalculatorListener);
		
		JPanel jpb = new JPanel();
		jpb.setLayout(new GridLayout(2,3,10,10));
		jpb.add(jbtn_plus);
		jpb.add(jbtn_minus);
		jpb.add(jbtn_div);
		jpb.add(jbtn_mul);
		jpb.add(jbtn_mod);
		jpb.add(jbtn_pow);
		
		
		this.setLayout(new BorderLayout());
		this.add(jpl_input_output,BorderLayout.CENTER);
		this.add(jpb, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	private void getInPut()
	{
		this.miniCalculatorModel.setFirstValue( Double.valueOf(jtf_firstValue.getText()));
		this.miniCalculatorModel.setSecondValue(Double.valueOf(jtf_secondValue.getText()));
	}
	
	public void plus() 
	{
		getInPut();
		this.miniCalculatorModel.plus();
		this.jtf_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}

	public void minus() 
	{
		getInPut();
		this.miniCalculatorModel.minus();
		this.jtf_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}	

	public void mul() 
	{
		getInPut();
		this.miniCalculatorModel.multiply();
		this.jtf_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}

	public void div() 
	{
		getInPut();
		this.miniCalculatorModel.divide();
		this.jtf_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}

	public void mod() 
	{
		getInPut();
		this.miniCalculatorModel.mod();
		this.jtf_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}

	public void pow() 
	{
		getInPut();
		this.miniCalculatorModel.pow();
		this.jtf_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}
}
