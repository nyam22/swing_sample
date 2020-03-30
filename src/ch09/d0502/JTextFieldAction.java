package ch09.d0502;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldAction extends JFrame implements ActionListener
{	
	JTextField jt0 = null;
	JTextField jt1 = null;
	JTextField jt2 = null;
	JButton jb0 = null;

	public JTextFieldAction()
	{
		super(" 스윙 JTextField 테스트");
	
		setLayout(null);	// Layout 을 직접 배치

		jt0 = new JTextField();
		jt0.setBounds(40, 40, 200, 20);		
		jt0.setEditable(true);
		getContentPane().add(jt0);
		
		jt1 = new JTextField();
		jt1.setBounds(40, 65, 200, 20);		
		jt1.setEditable(true);
		getContentPane().add(jt1);
		
		jt2 = new JTextField();
		jt2.setBounds(40, 90, 200, 20);
		jt2.setText("합계");	
		jt2.setEditable(false);
		getContentPane().add(jt2);

		jb0 = new JButton("확인");
		jb0.setBounds(40, 115, 200, 20);
		getContentPane().add(jb0);
		
		jb0.addActionListener(this);

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setLocation(screenSize.width / 6, screenSize.height / 6);
		setSize(300, 200);
		setResizable(true);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e){
		System.out.println(" ActionEvent e : " + e  + "\n");
		System.out.println(" e.getSource() : " + e.getSource()  + "\n");
		
		if ( e.getSource() == jb0)
		{
			int xVal[] = new int[2];
			xVal[0] = Integer.parseInt(jt0.getText());
			xVal[1] = Integer.parseInt(jt1.getText());
			
			int sumVal = sumFunc(xVal);
			
			jt2.setText("");
			jt2.setText(String.valueOf(sumVal));
			String jtStr2 = jt2.getText();
			System.out.println(" jtStr2 >>> : " + jtStr2);
			
			/*
			System.out.println(" jb0.getText() : " + jb0.getText() );
			String jtStr0 = jt0.getText();
			String jtStr1 = jt1.getText();
			System.out.println(" jtStr0 >>> : " + jtStr0);
			System.out.println(" jtStr1 >>> : " + jtStr1);
			
			int xVal = Integer.parseInt(jtStr0);
			int yVal = Integer.parseInt(jtStr1);						
			int sumVal = xVal + yVal;
				     
			jt2.setText("");
			jt2.setText(String.valueOf(sumVal));
			String jtStr2 = jt2.getText();
			System.out.println(" jtStr2 >>> : " + jtStr2);
			*/
		}		
	}
	
	public static int sumFunc(int xVal[]){
		
		int sumVal = 0;
		for (int i=0; i < xVal.length; i++){
			sumVal += xVal[i];
		}
		
		return sumVal;
	}

	public static void main(String args[])
	{
		new JTextFieldAction();
	}
}

