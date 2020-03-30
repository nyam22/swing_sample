package ch09.d0430;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class FlowLayoutTest_1 extends JFrame
{
	public static final String IMG_PATH
			= "C://00.koitt02//csWork//babyProject//src//images//img//";
	
	JPanel jp1 = null;
	JPanel jp2 = null;
	
	JButton jb1 = null;
	JButton jb2 = null;
	JButton jb3 = null;
	JButton jb4 = null;
	JButton jb5 = null;
	
	ImageIcon img1 = null;
	ImageIcon img2 = null;
	ImageIcon img3 = null;
	ImageIcon img4 = null;
	ImageIcon img5 = null;
	
	public FlowLayoutTest_1()
	{
		super(" 버튼 이미지 테스트 ");
		
//		setLayout(new BorderLayout());
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jp1.setLayout(new FlowLayout(0));
		jp2.setLayout(new FlowLayout(1));
		
		jp1.setBackground(Color.yellow);
		jp2.setBackground(Color.cyan);
		
		img1 = new ImageIcon(IMG_PATH + "yoshi.gif");
		jb1 = new JButton("", img1);
		img2 = new ImageIcon(IMG_PATH + "enkai_dojou.gif");
		jb2 = new JButton("", img2);
		img3 = new ImageIcon(IMG_PATH + "itete.gif");
		jb3 = new JButton("", img3);
		img4 = new ImageIcon(IMG_PATH + "kiba.gif");
		jb4 = new JButton("", img4);
		img5 = new ImageIcon(IMG_PATH + "ihi.gif");
		jb5 = new JButton("", img5);
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		jp2.add(jb4);
		jp2.add(jb5);
		
		add(jp1, "North");
		add(jp2, "South");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 300);
		setSize(500, 600);
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutTest_1();
	}

}
