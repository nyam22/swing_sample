package ch09.d0502;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageTest extends JFrame
{
	public static final String IMG_PATH
		= "C://00.koitt02//csWork//babyProject//src//images//";
	// 공동으로 나누거나 계속 사용할 경우, 문자열은 상수로 사용한다. 
	//String path = "C://00.koitt02//csWork//babyProject//src//";
	
	public ImageTest()
	{
		super(" Image Test !! ");
		
		//ImageIcon img = new ImageIcon(path + "img//Desert.jpg");
		//ImageIcon img = new ImageIcon(path + "img//Lighthouse.jpg");
		//ImageIcon img = new ImageIcon(path + "img//Tulips.jpg");
		ImageIcon img = new ImageIcon(IMG_PATH + "img//67.png");
		JButton jb = new JButton(" ", img);
		
		//add(jb, "South");
		add(jb, "North");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 400);
		setSize(500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageTest();
	} //EOM main

} //EOC
