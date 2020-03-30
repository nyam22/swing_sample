package ch09.d0503;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class BasicCompWin extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public BasicCompWin(String title)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setTitle(title);
		
		JLabel lb = new JLabel("Text of Label");
		lb.setForeground(Color.blue);
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lb);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		BasicCompWin win = new BasicCompWin("레이블 알아보기");
	}

}
