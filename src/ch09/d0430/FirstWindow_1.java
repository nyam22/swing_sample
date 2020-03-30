package ch09.d0430;

import java.awt.Color;
import javax.swing.JFrame;

public class FirstWindow_1 extends JFrame
{
	public FirstWindow_1()
	{
		//super("Super Construct");
		setTitle("First Graphic User Interface");
		setLocation(800,400);
		setSize(400,300);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE); // JFrame 자신을 가르킨다
//		setDefaultCloseOperation(super.EXIT_ON_CLOSE);
		setVisible(true);
		
//		int time = 60 * 60 * 24 * 365;
		int time = 255;
		for (int i=0; i<time; i++)
		{
			try
			{
				Thread.sleep(50);
			}catch(Exception e){}
			Color b = new Color(i,i,i);
			getContentPane().setBackground(b);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstWindow_1 fw = new FirstWindow_1();
	}

}
