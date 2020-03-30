package ch09.d0503;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ToggleButtonWin extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	JPanel pCheck = new JPanel();
	JPanel pRadio = new JPanel();
	
	public ToggleButtonWin(String title)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 150);
		setTitle(title);
		
		makeCheckBox();
		makeRadioButton();
		
		setLayout(new GridLayout(0,  1));
		getContentPane().add(pCheck);
		getContentPane().add(pRadio);
		setVisible(true);
	}
	
	public void makeCheckBox()
	{
		pCheck.setBackground(Color.yellow);
		JCheckBox box = new JCheckBox("수영");
		pCheck.add(box);
		pCheck.add(new JCheckBox("골프"));
		pCheck.add(new JCheckBox("축구"));		
		pCheck.add(new JCheckBox("야구"));
	}
	
	public void makeRadioButton()
	{
		JRadioButton r1 = new JRadioButton("First Class");
		JRadioButton r2 = new JRadioButton("Business Class", true);
		JRadioButton r3 = new JRadioButton("Economy Class");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);  bg.add(r2);  bg.add(r3);
		
		pRadio.setBackground(Color.cyan);
		pRadio.add(r1);  pRadio.add(r2);  pRadio.add(r3);
	}
	
	public static void main(String[] args) {
		ToggleButtonWin win = new ToggleButtonWin("토글버튼");
	}

}
