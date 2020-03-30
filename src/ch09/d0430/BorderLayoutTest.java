package ch09.d0430;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame
{
	JButton jb0;
	JButton jb1;
	JButton jb2;
	JButton jb3;
	JButton jb4;
	
	// ������
	public BorderLayoutTest()
	{
		super("Border Layout Test !!");
		
		setLayout(new BorderLayout(50, 50));
		jb0 = new JButton("�ֿ�ȣ");
		jb1 = new JButton("�Ѽ���");
		jb2 = new JButton("����ȣ");
		jb3 = new JButton("�����");
		jb4 = new JButton("Ȳ����");
		/*
		add(jb0, "North");
		add(jb1, "South");
		add(jb2, "East");
		add(jb3, "West");
		add(jb4, "Center");
		*/
		add(jb0, BorderLayout.NORTH);
		add(jb1, BorderLayout.SOUTH);
		add(jb2, BorderLayout.EAST);
		add(jb3, BorderLayout.WEST);
		add(jb4, BorderLayout.CENTER);
			
		/*
		System.out.println(" > JFrame Default layout : " + getLayout());
		setLayout(new BorderLayout());
		System.out.println(" > BorderLayout : " + getLayout());
		*/
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setLocation(200, 300);
		setSize(500, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutTest();
	} // EOM main 

} // EOC
