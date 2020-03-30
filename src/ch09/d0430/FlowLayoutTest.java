package ch09.d0430;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame{

	JButton jb0;
	JButton jb1;
	JButton jb2;
	JButton jb3;	
	JButton jb4;
	
	public FlowLayoutTest(){
		super("플로우레이아웃 테스트");
		System.out.println(" JFrame 플로우레이아웃 매니저 : " + getLayout());
		
		setLayout(new FlowLayout(0));
		System.out.println(" JFrame  : " + getLayout());
		jb0 = new JButton("1");
		jb1 = new JButton("2");
		jb2 = new JButton("3");
		jb3 = new JButton("4");
		jb4 = new JButton("5");
				
		add(jb0);
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setLocation(200, 300);
		setSize(500, 600);
		setVisible(true);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutTest();
	}

}
