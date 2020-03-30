package ch09.d0501;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FlowLayoutTest_2 extends JFrame
{
	public static final String IMG_PATH
	= "C://00.koitt02//csWork//babyProject//src//images//img//";
	
	JPanel jp1 = null;
	JPanel jp2 = null;
	JPanel jp3 = null;

	JButton jb1 = null;
	JButton jb2 = null;
	JButton jb3 = null;
	JButton jb4 = null;
	JButton jb5 = null;
	JButton jb6 = null;

	ImageIcon img1 = null;
	ImageIcon img2 = null;
	ImageIcon img3 = null;
	ImageIcon img4 = null;
	ImageIcon img5 = null;
	ImageIcon img6 = null;
	
	JLabel jl1 = null;
	
	public FlowLayoutTest_2()
	{
		super("Button & Event Test !!");
		
		setLayout(null);
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jl1 = new JLabel(" hahaha Study hard !!", JLabel.CENTER);
		jl1.setFont(new Font("돋음", 20, 20));
		
		jp1.setLocation(10, 10);
		jp1.setSize(460, 100);
		jp1.setLayout(new FlowLayout(0));
				
		jp2.setLocation(10, 450);
		jp2.setSize(460, 100);
		jp2.setLayout(new FlowLayout(2));

		jp3.setLocation(50, 150);
		jp3.setSize(380, 250);
		jp3.setLayout(new BorderLayout());

		jp1.setBackground(Color.yellow);
		jp2.setBackground(Color.cyan);
		jp3.setBackground(Color.white);
		
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
		img6 = new ImageIcon(IMG_PATH + "ma-gao2.gif");
		jb6 = new JButton("", img6);

		jb6.addActionListener(new MyListener());

		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);

		jp2.add(jb4);
		jp2.add(jb5);

		jp3.add(jb6, "North");
		jp3.add(jl1);

		add(jp1);
		add(jp2);
		add(jp3);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 300);
		setSize(500, 600);
		setResizable(false);
		setVisible(true);
	}

	private class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			System.out.println(" e >>> : " + e);
		
			if (e.getSource() == jb6)
			{
				jl1.setText(" 노동절에도 겅부 하장 !!! ");
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		new FlowLayoutTest_2();
	}

}
