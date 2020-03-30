package ch09.d0501;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowTest {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("JFrame Test");
		f.setSize(300, 200);
		//f.setDefaultCloseOperation(3);
		f.setVisible(true);
		
		// WindowAdapter�� �̿��Ͽ� ������â �ݱ� ó��
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});

	} // EOM main
	
} // EOC
