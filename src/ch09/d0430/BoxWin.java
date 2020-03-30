package ch09.d0430;

//import java.awt.Component;
//import java.awt.ComponentOrientation;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxWin extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	
	public BoxWin(String title)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 200);
		setTitle(title);
		
		Container cp = getContentPane();
		//cp.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		//cp.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); 
		cp.setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));   
		//cp.setLayout(new BoxLayout(cp, BoxLayout.X_AXIS));               
		//cp.setLayout(new BoxLayout(cp, BoxLayout.LINE_AXIS));            
		//cp.setLayout(new BoxLayout(cp, BoxLayout.PAGE_AXIS));            
		
		btn1 = new JButton("Btn 1");
		btn2 = new JButton("Button 2");
		btn3 = new JButton("BoxLayout 3");
		btn4 = new JButton("BoxLayout.X_AXIS 4");
		btn5 = new JButton("BoxLayout.Y_AXIS 5");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		setVisible(true);
	} //EOCst

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxWin win = new BoxWin("BoxLayout Window");
	} //EOM main

} //EOC
