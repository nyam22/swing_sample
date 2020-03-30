package ch09.d0503;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFieldWin extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public TextFieldWin(String title)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 350);
		setTitle(title);
		makeTextField();
		setVisible(true);
	}
	
	public void makeTextField()
	{
		JPanel pL = new JPanel();
		pL.setBackground(Color.yellow);
		pL.setLayout(new GridLayout(0, 1, 20, 10));
		pL.add(new JLabel("  �� �� :  "));
		pL.add(new JLabel("  �� ȣ :  "));
		pL.add(new JLabel("  �� �� :  "));
		
		JPanel pR = new JPanel();
		pR.setBackground(Color.cyan);
		pR.setLayout(new GridLayout(0, 1, 20, 5));
		JTextField tf = new JTextField();
		tf.setText("ȫ �浿");
		pR.add(tf);
		
		JPasswordField pwd = new JPasswordField();
		pwd.setEchoChar('#');
		pR.add(pwd);
		
		JFormattedTextField date = new JFormattedTextField();
		date.setValue(new Date());
		pR.add(date);
		
		JPanel pD = new JPanel();
		JTextArea ta = new JTextArea(8, 30);
		ta.setText("JTextComponent\n");
		ta.append(" JTextField\n");
		ta.append(" JTextArea\n");
		ta.append(" JEditorPane\n");
		pD.add(new JLabel("  �� �� :  "));
		pD.add(ta);
		
		getContentPane().add(pL, "West");
		getContentPane().add(pR, "Center");
		getContentPane().add(pD, "South");				
	}

	public static void main(String[] args) {
		TextFieldWin win = new TextFieldWin("�ؽ�Ʈ�ʵ� �˾ƺ���");
	}

}
