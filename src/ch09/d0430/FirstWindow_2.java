package ch09.d0430;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Dimension;

import javax.swing.JFrame;

public class FirstWindow_2 extends JFrame
{
	public FirstWindow_2()
	{
		super("Swing JFrame Test !!");
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		
		System.out.println(" kit : " + kit);
		System.out.println(" screenSize : " + screenSize);
		System.out.println(" screenSize.width : " + screenSize.width);
		System.out.println(" screenSize.height : " + screenSize.height);
		System.out.println(" screenSize.width/2 : " + screenSize.width/2);
		System.out.println(" screenSize.height/2 : " + screenSize.height/2);
		
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setLocation(screenSize.width/2, screenSize.height/2);
		setSize(400,300);
		setResizable(false);
		setVisible(true);
		
		Color[] color = {   Color.yellow, Color.blue, Color.cyan,
							Color.DARK_GRAY, Color.GREEN, Color.LIGHT_GRAY,
							Color.MAGENTA, Color.ORANGE, Color.pink,
							Color.red, Color.black};
		
		int i = 0;
		int day_3 = 20;
		
		System.out.println(" start >> " + (System.currentTimeMillis()/1000));
		
		while(day_3 > 0)
		{
			try
			{
				Thread.sleep(500);
			}catch(Exception e){}
			
			getContentPane().setBackground(color[i]);
			
			i = (i + 1) % 11;
			
			day_3--;
		}
		
			System.out.println(" over >> " + (System.currentTimeMillis()/1000));
			
			dispose();
			System.exit(0);
				
	} // EOCst
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FirstWindow_2();
	} // EOM main

} // EOC
