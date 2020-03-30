package ch09.d0430;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame{

	JButton jb0;
	JButton jb1;
	JButton jb2;
	JButton jb3;	
	JButton jb4;
	JButton jb5;
	
	public GridLayoutTest(){
		super(" 그리드 레이아웃 ");
		
		setLayout(new GridLayout(3, 2));
		
		jb0 = new JButton("1");
		jb1 = new JButton("2");
		jb2 = new JButton("3");
		jb3 = new JButton("4");
		jb4 = new JButton("5");
		jb5 = new JButton("6");
		
		add(jb0);
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);
		
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setLocation(200, 300);
		setSize(500, 600);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutTest();
	}

}

