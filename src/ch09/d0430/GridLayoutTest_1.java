package ch09.d0430;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest_1 extends JFrame {

	JButton jb[] = null;
	
	// 생성자
	public GridLayoutTest_1(){
		super(" 계산기 테스트 ");
		
		jb = new JButton[16];
		String label[] = { "1", "2", "3", "/",
				           "4", "5", "6", "*",
				           "7", "8", "9", "-",
				           "*", "0", "#", "+"};
		setLayout(new GridLayout(4, 3 , 6, 6));
		
		for(int i=0; i < 16; i++){
			jb[i] = new JButton(label[i]);
			add(jb[i]);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 300);
		setSize(300, 200);		
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new GridLayoutTest_1();

	}
}
